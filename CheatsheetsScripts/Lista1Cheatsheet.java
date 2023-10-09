import java.util.Scanner;  // Importowanie klasy Scanner

// Klasa Main
public class Lista1Cheatsheet {
    // Metoda main
    public static void main(String[] args) {

        //
        // Typy zmiennych
        //

        //
        // Typy całkowite
        //
        byte zmienna_typu_byte = 82; // 8 bitów
        short zmienna_typu_short = 1_234; // 16 bitów
        int zmienna_typu_int = 1_234_567; // 32 bity, domyślny typ całkowity
        long zmienna_typu_long = 1_234_567_891L; // 64 bity

        // Można zadeklarować zmienną bez definiowania jej wartości, a następnie przypisać jej konkretną wartość
        int zmienna;
        zmienna = 100;

        // UWAGA: zmienna przed przypisaniem jej wartości musi być zadeklarowana i mieć przypisany typ danej jaką przechowuje
        // niezadeklarowana_zmienna = 2347683; <- Ta linia kodu wyprodukuje błąd kompilacji, zmienna nie została zadeklarowana

        // Wartość zmiennej można zmienić
        zmienna_typu_int = 7_654_321; // każda instrukcja musi się kończyć średnikiem!

        // Można wykonać kilka deklaracji w jednym miejscu
        int z1 = 101, z2 = 102;

        //
        // Typy zmienno przecinkowe
        //
        // typ zmiennoprzecinkowy pojedynczej precyzji, na końcu trzeba dodać 'f' lub 'F'
        float zmienna_typu_float = 123.4562432F; // 32 bity
        // typ zmiennoprzecinkowy podwójnej precyzji, domyślny typ zmiennoprzecinkowy
        double zmienna_typu_double = 123.4567823476236847; // 64 bity

        // Uwaga na mieszanie różnych typów i stratną konwersję
        // zmienna_typu_int = 7_654_321.123; <- tak nie wolno, stratna konwersja, trzeba dodać (int)
        zmienna_typu_int = (int)7_654_321.123; // tu dochodzi do stratnej konwersji, tracimy wszystko po kropce

        // Uwaga #2: dzielenie liczb całkowitych
        zmienna_typu_short = 3/2; // Wynikiem tego działania będzie 1, dochodzi tu do niejawnej konwersji na typ całkowity

        //
        // Znaki
        //
        char zmienna_typu_char = 'a';
        // W teorii znaki zaliczane są do typów całkowitycz ponieważ są przechowywane w pamięci jako liczby całkowite
        // Można więc wykonywać na nich operacje typu: char b = 'a'+1;
        System.out.println("a + 1 = " + (zmienna_typu_char + 1));

        //
        // Typ logiczny
        //
        boolean zmienna_typu_boolean = true; // lub false

        //
        // Typy złożone: typ String
        //
        String zmienna_typu_string = "jakiś tekst";

        //
        // Operatory
        //

        //
        // Operatory arytmetyczne
        //
        // +, -, *, /, %
        zmienna_typu_int = 10%3; // zmienna przyjmie wartość równą reszcie z dielenia 10/3, czyli 1

        //
        // Operatory przypisania
        //
        // =, +=, -=, *=, /=, %=, ++, --
        // Operatory inkremmentacji i dekrementacji są równoważne z operacjami:
        // ++x -> x = x + 1, --x -> x = x - 1
        // Różnica między ++x i x++: w przypadku x++ wpierw jest przekazana wartość 'x' a następnie jest zwiększona o 1
        /* Przykład:
        int x = 5;
        int y = x++;
        int z = ++x;
        W powyższym przykładzie: y = 5, z = 7 oraz x = 7;
        */

        //
        // Operatory logiczne
        //
        // && - AND, || - OR, ^ - XOR, ! - NOT
        // == - równe, != - różne, > - większe, < - mniejsze, >= - większe lub równe, <= - mniejsze lub równe,
        // x == y - ta operacja zwórci true jeśli 'x' i 'y' są równe i false jeśli są różne

        //
        // Klasa Math
        //

        zmienna_typu_double = Math.sqrt(2); // pierwiastek z 2
        // sin(x), cos(x), abs(x),  sqrt(x), pow(x, y), log(x), exp(x), min(x, y), max(x, y), round(x)
        // Funkcja Math.random() losuje liczbę z zakresu [0,1)
        zmienna_typu_int = (int)(Math.random()*11); // Losowanie liczby całkowitej z zakresu [0,10]
        // Można też tak: zmienna_typu_int = Math.round(Math.random()*10);

        //
        // Instrukcje I/O
        //

        //
        // Wypisywanie danych do konsoli
        //
        System.out.println("Hello cruel world!");
        // Wypisywanie zmiennych
        System.out.println("z1 = " + z1 + ", z2 = " + z2);
        // System.out.println(zmienna_typu_string);
        // Bez przejścia do nowej linii: System.out.print();
        // Liczby można fomatować na wyjściu za pomocą metody printf (składnia podobna jak pythonie)
        System.out.printf("Zformatowany output: %.2f\n", zmienna_typu_float); // Uwaga na brak przejścia do nowej linii

        //
        // Wczytywanie danych z konsoli
        //
        // Wpierw trzeba zaimportować klasę Scanner (poprzez napisanie [import java.util.Scanner;] na początku pliku)
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj jakąś liczbę: ");
        zmienna_typu_double = sc.nextDouble();
        // Istnieją odpowiedniki dla innych typów:
        // zmienna_typu_string = sc.nextLine();
        // zmienna_typu_int = sc.nextInt();
        System.out.println("Podana liczba: " + zmienna_typu_double);
        // Formatowanie liczb na standardowym wyjściu
        System.out.printf("Zmienna typu int: %d, zmienna typu float: %.2f\n", zmienna_typu_int, zmienna_typu_float);

        //
        // Pętle i instrukcje warunkowe
        //

        //
        // Pętla for
        //
        /*
        for (odkąd; dokąd; o ile) {
            instrukcja do wykonania
        }
         */
        // Pętla for licząca sumę cyfr od 0 do 9
        int sum = 0;
        for (int i = 0; i<10; i++) {
            sum += i;
        }
        // Lub w przypadku instrukcji jednoliniowych można krócej
        sum = 0;
        for (int i = 0; i<10; i++) sum += i;
        // można też iść od końca
        for (int i = 9; i>=0; i--) sum += i;

        //
        // Pętla while
        //
        /*
        while (warunek) {
            instrukcja do wykonania
        }
        lub
        do {
            instrukcja do wykonania
        }
        while (warunek);
        */
        int z3 = 121;
        while (z3>z2) {
            z3--;
        }
        // UWAGA: w przypadku pętli while można bardo łatwo utworzyć przypadkiem pętlę nieskończoną!

        //
        // Instrukcje warunkowe
        //
        /*
        if (warunek1) {
           instrukcja jeśli warunek1 = true
        }
        else if (warunek2) {
            instrukcja jeśli warunek1 = false i warunek2 = true
        }
        else {
            instrukcja jeśli warunek1 = warunek2 = false
        }
         */
        if (z1 > z2) {
            System.out.println("z1 jest większe");
        }
        else if (z2 > z1) {
            System.out.println("z2 jest większe");
        }
        else {
            System.out.println("z1 i z2 są równe");
        }
        //
        // Lub w przypadku instrukcji jednoliniowych można krócej
        z1 = z2;
        if (z1 > z2) System.out.println("z1 jest większe");
        else if (z2 > z1) System.out.println("z2 jest większe");
        else System.out.println("z1 i z2 są równe");
        //
        // Instrukcje warunkowe można stosować przy przypisywaniu wartości zmiennym za pomocą operatora'?'
        // int zmienna = warunek ? jeśli warunek == true : jeśli warunek == false;
        int z4 = z2<0 ? -z2 : z2; // Do zmiennej 'z4' przypisujemy wartość bezwzględną zmiennej 'z2'

        //
        // Instrukcja switch
        //
        /*
        switch(expression) {
          case x:
            // code block
            break;
          case y:
            // code block
            break;
          default:
            // code block
        }
         */
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        //
        // DODATEK 1: Operatory bitowe
        //
        // | - bitowe OR, & - bitowe AND, ^ - bitowy XOR
        // ~ - dopełnienie bitowe (zmienia wszystkie 0 na 1 i odwrotnie )
        // >>, << - operacje przesunięcia bitów w prawo / w lewo
        // Analogicznie jak w prypadku + czy -, dla x = x << 1 mamy x << 1
        System.out.println();
        System.out.println("W kodzie binarnym " + zmienna_typu_byte + " = " + Integer.toBinaryString(zmienna_typu_byte));
        int val = 1;
        // Przesunięcie w lewo
        for (int i = 0; i < 5; i++) {
            for (int t = 16; t> 0; t/=2) {
                if((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("= " + val);
            val <<= 1;
        }
        // Przesunięcie w prawo
        val = 16;
        for (int i = 0; i < 5; i++) {
            for (int t = 16; t> 0; t/=2) {
                if((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("= " + val);
            val >>= 1;
        }
        /* Output powyższego kodu
        0 0 0 0 1 = 1
        0 0 0 1 0 = 2
        0 0 1 0 0 = 4
        0 1 0 0 0 = 8
        1 0 0 0 0 = 16
        1 0 0 0 0 = 16
        0 1 0 0 0 = 8
        0 0 1 0 0 = 4
        0 0 0 1 0 = 2
        0 0 0 0 1 = 1
        */
    }
}