import java.util.ArrayList;
import java.util.Collections;

/**
 * Klasa Lista3Cheatsheet
 */
public class Lista3Cheatsheet {
    /**
        * Zwraca większą liczbę
        * @param x1  pierwsza liczba
        * @param x2  druga liczba
        * @return  większa liczba
        * @throws  IllegalArgumentException if x1 == x2
        */
    static int maxIntNum(int x1, int x2) {
        int x = x2;
        try {
            if (x1 > x2) x = x1;
            else if (x1 == x2)
                throw new IllegalArgumentException("Wyjątek w metodzie maxIntNum: x1 == x2 == " + x);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return x;
    }

    /**
     * Metoda main
     */
    public static void main(String[] args) {
        //
        // Metody
        //

        // Konstrukcja metod
        /*
        /modyfikatory/ /zwracany typ/ /nazwa metod/ ( parametry ) {
            Ciało metody
            ...
            return zwracana wartość
         }
         Przykład, metoda main: public static void main(String[] args) { }
         public - metoda może być wywoływana poza klasą
         static - do stosowania metody nie trzeba tworzyć obiektu
                  przykład: niektóre metody klasy Math takie jak np. Math.sqrt(), albo metoda System.out.println()
         void - metoda main nic nie zwraca
         String[] args - argumenty wiersza poleceń przechowywane jako tablica typu String
                         np. w przypdaku java Main 1 2 zmienna args = ["1", "2"]
         */

        // Przeładowywanie metod
        /*
        Metody mogą wspóldzielić nazwę tak długo jak:
            - przyjmują różną liczbę parametrów,
            - przyjmują parametry różnego typu.

        Uwaga: różny zwracany typ nie wystarczy! W przypadku metod o tej samej nazwie ale różnym zwracanym typie
        w chwili wywołania Java nie wie, z której metody chcemy skorzystać.

        Sprawa ma się inaczej w przypadku metod przyjmujących parametry różnego typu, wtedy Java wie, z której metody
        chcemy skorzystać po typie przekazywanej zmiennej.

        Przykłady przeciążania metod:

            - int metoda(int x) {...}
              int metoda(int x, int y) {...} - Ok, różna liczba parametrów (metoda(x) != metoda(x, y))

            - int metoda(int x) {...}
              int metoda(double x) {...} - Ok, różne typy argumentów metod

            - int metoda(int x) {...}
              double metoda(int x) {...} - Źle, w chwili wywołania, metoda(x), Java nie wie o którą metodę nam chodzi!
        */

        //
        // Kontrola wyjątków
        //

        /*
        Błędy czasu kompilacji - problemy z kompilacją kodu
            - literówki, błędy składniowe, np. brak średnika albo klamry zamykającej,
            - wywołanie nieistniejących metod,
            - odwołanie do nieistniejących zmiennych.
        Błędy czasu wykonania - problemy z nieoczekiwanym zachowaniem programy podczas wykonania
            - np. dzielenie przez 0 czy nieprawidłowe dane wejściowe do metody.

        Wyjątek - nieprawidłowe warunki pojawiające się podczas wykonywania kodu
            - ArithmeticException (np. dzielenie przez 0)
            - ArrayIndexOutOfBoundsException (odwołanie do indeksu tablicy, który nie istnieje),
              analogicznie StringIndexOutOfBoundsException,
            - NumberFormatException (błąd w parsowaniu stringów na liczby),
            - IllegalArgumentException (nieprawidłowe dane wejściowe do metody).

        NullPointerException
            - typy referencyjne (w odróżnieniu od prymitywnych) mogą być niezainicjalizowane, tzn. mieć przypisaną wartość null
            - próba wykonania operacji na niezainicjalizowanej zmiennej “nullowej” powoduje rzucenie NullPointerException
            - NullPointerException można unikać,
                a) unikając stosowania “nullowych” zmiennych;
                b) sprawdzając, czy zmienna jest null przed operacją.

        try {
            // code that may throw an exception
        } catch (Exception e) {
            // exception handler
        } finally {
            // code that will always be executed
        }
        */

        System.out.println();

        try {
            double d = 2 / 0;
        } catch (Exception e) {
            System.out.println("Wyjątek 1: " + e.getMessage());
        }

        int[] tab = new int[5];
        try {
            System.out.println(tab[5]);
        } catch (Exception e) {
            System.out.println("Wyjątek 2: " + e.getMessage());
        }

        String str1 = "Hello world";
        try {
            System.out.println(str1.charAt(-1));
        } catch (Exception e) {
            System.out.println("Wyjątek 3: " + e.getMessage());
        }

        String str2 = null;
        try {
            System.out.println(str2.charAt(-1));
        } catch (Exception e) {
            System.out.println("Wyjątek 4: " + e.getMessage());
        }

        //
        // Rzucanie wyjątków
        //

        try {
            throw new Exception("An exception occurs");
        } catch (Exception e) {
            System.out.println("Wyjątek 6: " + e.getMessage());
        }

        try {
            throw new IllegalArgumentException("Incorrect sum " + -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjątek 6: " + e.getMessage());
        }

        try {
            throw new ArrayIndexOutOfBoundsException("Incorrect index " + -1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyjątek 7: " + e.getMessage());
        }

        int i = 100;
        try {
            if (i < 0) throw new ArrayIndexOutOfBoundsException("Incorrect index " + i);
            else throw new IllegalArgumentException("Incorrect sum " + i);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjątek 8.1: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyjątek 8.2: " + e.getMessage());
        } finally {
            System.out.println("Ten blok wykona się za każdym razem");
        }

         System.out.println(maxIntNum(1, 1));

        //
        // Tablice dynamiczne - ArrayList
        //
        // W odróżnieniu od tablic statycznych mogą zmieniać swój rozmiar
        // Uwaga #1: trzeba na początkj pliku zaimportować klasę ArrayList: import java.util.ArrayList;
        // Uwaga #2: elementy tej tablicy są obiektami i zamiast typów prymitywnych należy używać ich "wrapperów"
        //           int -> Integer, double -> Double itd.
        //

        // Wrappery
        Integer ii = i;  // Niejawna konwersja z typu prymitywnego na typ Integer
        System.out.println("Wartość ii jako int: " + ii.intValue());
        System.out.println("Wartość ii jako double: " + ii.doubleValue());
        // W przypadku przypisania i = ii doszłoby do niejawnej konwersji z Integer na int
        // W celu konwersji na String należy użyć metody toString()

        ArrayList<String> array1 = new ArrayList<String>(); // Create an ArrayList object
        /*
        metody tablic ArrayList:
            - add() - dodawanie elementów
            - get(index) - pobieranie elementów
            - set(index) - ustawianie wartości elementu
            - remove(index) - usuwanie elementu
            - clear() - usuwanie wszystkich elementów
            - size() - sprawdzanie rozmiaru tablicy
         */
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int j=20; j>0; j--) {
            array2.add(j*j);
        }
        System.out.print("[");
        for (int j : array2) System.out.printf("%d ", j);
        System.out.println("]");

        Collections.sort(array2);
        System.out.print("[");
        for (int j : array2) System.out.printf("%d ", j);
        System.out.println("]");

    }
}
