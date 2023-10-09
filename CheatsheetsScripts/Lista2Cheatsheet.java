public class Lista2Cheatsheet {
    public static void main(String[] args) {
        //
        // Tablice stacjonarne
        //

        // Tablica - zbiór elementów TEGO SAMEGO typu
        // typ[] nazwa_tablicy = new typ[rozmiar];
        int[] tablica_1 = new int[10]; // new - dynamiczna alokacja pamięci
        // tablica_1 nie przechowuje samej tablicy, tylko jej adres w pamięci

        double[] tablica_2; // W tym miejscu tablica_2 nie odnosi się do żadnego obiektu w pamięci
        // System.out.println(tablica_2);
        tablica_2 = new double[5]; // Do tablicy_2 zostaje przypisana 5 elementowa tablica typu double

        // Tablice można także inicjalizować już na etapie deklaracji
        int[] tablica_3 = {62, 13, 54, 34, 89};

        // Rozmiar tablicy jest ustalany na etapie tworzenia i nie można go zmienić w dalszej części programu
        // Są to tak zwane tablice statyczne (brak metod append czy pop)

        System.out.println("Pierwszy element tablicy_1: " + tablica_1[0]);
        System.out.println("Pierwszy element tablicy_2: " + tablica_2[0]);

        // W celu zapisu i odczytu danych z tablicy można użyć pętli for
        for (int i=0; i<10; i++) tablica_1[i] = i*i;
        System.out.print("tablica_1 = [");
        for (int i=0; i<10; i++) System.out.print(tablica_1[i] + " ");
        System.out.println("]");
        System.out.println("Adres tablicy tablica_3: " + tablica_3);

        // Tablice w Javie są obiektami, zawierają wieć szereg przydatnych metod i zmiennych
        // zmienna length zwraca rozmiar tablicy, dla której została wywołana
        System.out.print("tablica_3 = [");
        for (int i=0; i<tablica_3.length; i++) System.out.print(tablica_3[i] + " ");
        System.out.println("]");

        // Pętla for-each
        System.out.print("tablica_3 = [");
        for (int i : tablica_3) System.out.print(i + " ");
        System.out.println("]");
        // for (double i : tablica typu double) System.out.print(i + " ");

        // Tablice wielowymiarowe
        int[][] tablica_4 = new int[4][6];
        for (int i=0; i<tablica_4.length; i++)
            for (int j=0; j<tablica_4[i].length; j++)
                tablica_4[i][j] = (i+1)*(j+1);

        System.out.println("tablica_4 = [");
        for (int i=0; i<tablica_4.length; i++) {
            for (int j=0; j<tablica_4[i].length; j++)
                System.out.print(tablica_4[i][j] + "\t");
            System.out.println();
        }
        System.out.println("]");

        System.out.println("tablica_4 = [");
        for (int[] i : tablica_4) {
            for (int j : i)
                System.out.print(j + "\t");
            System.out.println();
        }
        System.out.println("]");

        int[][] tablica_6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("tablica_6 = [");
        for (int[] i : tablica_6) {
            for (int j : i)
                System.out.print(j + "\t");
            System.out.println();
        }
        System.out.println("]");

        // Można także tworzyć tablice wielowymiarowe o wierszach różnej wielkości
        int[][] tablica_5 = new int[3][];
        tablica_5[0] = new int[5];
        tablica_5[1] = new int[8];
        tablica_5[2] = new int[6];

        System.out.println("tablica_5 = [");
        for (int i=0; i<tablica_5.length; i++) {
            for (int j=0; j<tablica_5[i].length; j++)
                System.out.print(tablica_5[i][j] + "\t");
            System.out.println();
        }
        System.out.println("]");

        //
        // Ciągi znaków (stringi)
        //

        String str_1 = new String("Jakiś string #1");
        String str_2 = "Jakiś string #2 #2";
        System.out.println("str_1 = " + str_1);
        System.out.println("str_2 = " + str_2);
        // Ciągi znaków są niezmienne!

        //
        // Metody zmiennej String:
        //

        // int length(); - długość stringu
        // char charAt(i); - zwraca znak o podanym indeksie

        // boolean equals(s); - zwraca true jeśli string wywołujący metodę jest równy stringowi s
        // int indexOf(str); - zwraca położenie pierwszego wystąpienia str w stringu wywołującym (lub -1 jeśli go nie ma)
        System.out.println("str_2.indexOf(\"#2\"): " + str_2.indexOf("#2")); // zwróci indeks pod którym znajduje się "#2"
        System.out.println("str_2.indexOf(\"#1\"): " + str_2.indexOf("#1")); // zwróci -1

        // boolean equalsIgnoreCase(); - porównuje dwa ciągi znaków ignorując rozróżnienie na duże i małe litery
        System.out.println("str_1.equalsIgnoreCase(\"JAKIŚ STRING #1\"): " +
                str_1.equalsIgnoreCase("JAKIŚ STRING #1")); // zwróci true
        // Metody toLowerCase() i toUpperCase() - konwersja liter w ciągu na małe/duże litery
        System.out.println("\"QWERTY\".toLowerCase(): " + "QWERTY".toLowerCase());
        System.out.println("\"qwerty\".toUpperCase(): " + "qwerty".toUpperCase());

        // Metoda isEmpty() - sprawdza, czy string jest pusty
        String e = "";
        System.out.println("e.isEmpty()" + e.isEmpty()); // zwróci true

        // substring() - wycina ciąg znaków ze stringu wywołującego
        System.out.println("str_2.substring(6, 12): " + str_2.substring(6, 12)); // zwróci "string"

        // Metoda contains sprawdza czy string wywołujący zawiera dany podstring
        System.out.println("str_1.contains(\"#1\"): " + str_1.contains("#1")); // zwróci true
        System.out.println("str_2.contains(\"#1\"): " + str_2.contains("#1")); // zwróci false
        // Sprawdzanie "prefiksu" i "sufiksu" - metody startsWith() i endsWith()

        System.out.println("str_1.startsWith(\"Ja\"): " + str_1.startsWith("Ja")); // zwróci true
        System.out.println("str_1.endsWith(\"qwerty\")" + str_1.endsWith("qwerty")); // zwróci false, kończy się inaczej

        // Metoda replace() - zamienia fragment stringa na inny
        System.out.println(str_1.replace('i', 'u')); // wszystkie litery i zamienione na u
        System.out.println(str_2.replace("Ja", "Xxx")); // wszystkie fragmenty Ja zamienione na Xxx

        // Kowersja z typu String na int lub double: Integer.parseInt("9"), Double.parseDouble("9.1")
        System.out.println("Konwersja z typu String na int lub double: " + Integer.parseInt("9")  + ", " + Double.parseDouble("9.1"));
        // Kowersja z systemu szesnastkowego
        System.out.println("FF systemie dziesiętnym: " + Integer.parseInt("FF", 16));
    }
}