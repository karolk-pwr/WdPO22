package Lista6Cheatsheet;

import java.io.*;
import java.util.Scanner;

/*
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
*/

public class Main {

    /**
     * Klasa File
     */
    public static void fileClass() {
        // ------------------------------------------------------------------------
        // Operacje na plikach z użyciem klasy File
        // ------------------------------------------------------------------------
        String input_file = "input_file.txt";
        File fin = new File(input_file);
        if(fin.isFile()) System.out.println("Plik " + input_file + " istnieje!");
        else System.out.println("Błąd, plik nie istnieje!");
        System.out.println("Nazwa pliku: " + fin.getName());
        System.out.println("Adres pliku: " + fin.getAbsolutePath());
        System.out.println("Rozmiar pliku w bajtach: " + fin.length());
        // ------------------------------------------------------------------------
        // Operacje na folderach
        // ------------------------------------------------------------------------
        /*
        File folder = new File("out");
        if(folder.isFile()) {
            System.out.println("Folder istnieje!");
            System.out.println(folder.list().length);
        }
        else System.out.println("Błąd, folder nie istnieje!");
        */
        /*
        The File class methods
        --------------------------------------------------------------------------
        Method	            Type	    Description
        --------------------------------------------------------------------------
        canRead()	        Boolean	    Tests whether the file is readable or not
        canWrite()	        Boolean	    Tests whether the file is writable or not
        createNewFile()	    Boolean	    Creates an empty file
        delete()	        Boolean	    Deletes a file
        exists()	        Boolean	    Tests whether the file exists
        getName()	        String	    Returns the name of the file
        getAbsolutePath()	String	    Returns the absolute pathname of the file
        length()	        Long	    Returns the size of the file in bytes
        list()	            String[]	Returns an array of the files in the directory
        mkdir()	            Boolean	    Creates a directory
         */
    }

    /**
     *
     * @param filename nazwa pliku
     */
    public static void readByteStreamFromFile1(String filename) {
        int i;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(filename);
            do {
                i = fin.read();
                if (i!=-1) System.out.print((char) i);
            } while (i!=-1);
            System.out.println();
        } catch (FileNotFoundException exc) {
            System.out.println("Błąd, plik nie istnieje!");
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
        } catch (IOException exc) {
            System.out.println("Błąd, plik nie istnieje!");
        } finally {
            try {
                if (fin!=null) fin.close();
            } catch (IOException exc) {
                System.out.println("Błąd przy zamykaniu pliku!");
            }
        }
    }

    /**
     * try-with-resources statement, file is closed automatically at the end
     * @param filename nazwa pliku
     */
    public static void readByteStreamFromFile2(String filename) {
        int i;
        try (FileInputStream fin = new FileInputStream(filename)) {
            do {
                i = fin.read();
                if (i!=-1) System.out.print((char) i);
            } while (i!=-1);
            System.out.println();
        } catch (IOException exc) {
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
            System.out.println("Błąd, plik nie istnieje!");
        }
    }

    /**
     * try-with-resources statement, file is closed automatically at the end
     * @param filename nazwa pliku
     */
    public static void readCharStreamFromFile(String filename) {
        int i;
        // W rzeczywistości to: FileReader fin = new FileReader(new File(filename))
        try (FileReader fin = new FileReader(filename)) {
            do {
                i = fin.read();
                if (i!=-1) System.out.print((char) i);
            } while (i!=-1);
            System.out.println();
        } catch (IOException exc) {
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
            System.out.println("Błąd, plik nie istnieje!");
        }
    }

    /**
     * try-with-resources statement, file is closed automatically at the end
     * @param filename nazwa pliku
     */
    public static void readBufferStreamFromFile(String filename) {
        // W rzeczywistości: FileReader fin = new FileReader(new File(filename))
        try (BufferedReader fin = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = fin.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exc) {
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
            System.out.println("Błąd, plik nie istnieje!");
        }
    }

    /**
     * try-with-resources statement, file is closed automatically at the end
     * @param filename nazwa pliku
     */
    public static void readFileUsingScanner(String filename) {
        try (Scanner reader = new Scanner(new File(filename))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                line = line.replace("Trzy", "3");
                line = line.replace("Siedem", "7");
                line = line.replace("Dziewięć", "9");
                line = line.replace("Jeden", "1");
                System.out.println(line + ' ' + line.length());
            }
        } catch (IOException exc) {
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
            System.out.println("Błąd, plik nie istnieje!");
        }
    }

    /**
     *
     * @param filename nazwa pliku
     * @param output_string string do zapisania
     */
    public static void writeByteStreamToFile(String filename, String output_string) {
        try {
            FileOutputStream fout = new FileOutputStream(filename);
            for (int i=0; i<output_string.length(); ++i) {
                fout.write(output_string.charAt(i));
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Błąd, plik nie istnieje!");
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
        } catch (IOException exc) {
            System.out.println("Błąd przyu odczytywaniu pliku");
        }
    }

    /**
     *
     * @param filename nazwa pliku
     * @param output_string string do zapisania
     */
     public static void writeCharStreamToFile(String filename, String output_string) {
        try (FileWriter fout = new FileWriter(filename)){
            fout.write(output_string);
        } catch (FileNotFoundException exc) {
            System.out.println("Błąd, plik nie istnieje!");
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
        } catch (IOException exc) {
            System.out.println("Błąd przyu odczytywaniu pliku");
        }
    }

    /**
     * try-with-resources statement, file is closed automatically at the end
     * @param filename nazwa pliku
     */
    public static void readCSV(String filename) {
        // W rzeczywistości: FileReader fin = new FileReader(new File(filename))
        try (BufferedReader fin = new BufferedReader(new FileReader(filename))) {
            String line;
            line = fin.readLine(); // Nazwy kolumn
            while ((line = fin.readLine()) != null) {
                String[] val = line.split(",");
                System.out.println("Kolumna 1: " + val[0] + ", kolumna 2: " + val[1]);
            }
        } catch (IOException exc) {
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
            System.out.println("Błąd, plik nie istnieje!");
        }
    }

    /**
     *
     * @param file_in plik wejściowy
     * @param file_out plik wyjściowy
     */
    public static void copyFile(String file_in, String file_out) {
        try (BufferedReader fin = new BufferedReader(new FileReader(file_in));
             FileWriter fout = new FileWriter(file_out)){
            String line;
            while ((line = fin.readLine()) != null) {
                fout.write(line + '\n');
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Błąd, plik nie istnieje!");
            // FileNotFoundException to podklasa IOException, można zawrzeć w jednym catchu
        } catch (IOException exc) {
            System.out.println("Błąd przyu odczytywaniu pliku");
        }
    }

    /*
    public static void plikiJSON(String plik_json) {
        try {
            Object o = (new JSONParser().parse(new FileReader(plik_json)));
            JSONArray obj = (JSONArray) o;
            for (JSONObject res : obj.get(JSONObject.class))
            System.out.println(obj.get());
        } catch (IOException exc) {
            System.out.println("Błąd przyu odczytywaniu pliku");
        } catch (ParseException exc) {
            System.out.println(exc.getMessage());
        }
    }
    */

    /**
     *
     * @param args parametry wejściowe z konsoli
     */
    public static void main(String[] args) {
        fileClass();
        System.out.println("--------------------");
        readByteStreamFromFile1("input_file.txt");
        readByteStreamFromFile2("input_file.txt");
        readCharStreamFromFile("input_file.txt");

        System.out.println("--------------------");
        readCSV("plik_csv.csv");

        System.out.println("--------------------");
        readBufferStreamFromFile("wiersz_wp.txt");
        System.out.println("--------------------");
        readFileUsingScanner("wiersz_wp.txt");

        System.out.println("--------------------");
        writeByteStreamToFile("output_file_b.txt", "Jakiśtam łańcuch znaków");
        writeCharStreamToFile("output_file_ch.txt", "Jakiśtam łańcuch znaków");
        copyFile("wiersz_wp.txt", "wiersz_wp_kopia.txt");
        // plikiJSON("nobel_prizes.json");
    }
}