package lekcijaTris.labDarbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printCard2("Pēteris", "Kalniņš", "Venstpils", 35);
        printCard2("Pēteris2", "Kalniņš13", "Venstpils22", 36676);
        printCard2("Pēteris3", "Kalniņš14", "Venstpils3232", 36565);

        String name = "Juris";
        String surname = "Kreilis";
        String city = "Riga";
        int age = 32;


//
//        System.out.println(calculateFactorial(4));
        printCard2(name, surname, city, age);

        printCard();
        printCard();
        printCard();
        printNewLine();
        printCard();
        System.out.println("Beidzās programma");
        int randomLaukums12312312312 = aprekinatTaisnsturaLaukumu(4, 2);
        int randomLaukumsxxxxxx = 8;
        System.out.println("Taisnstūra laukums ir: " + randomLaukums12312312312);
        System.out.println("Taisnstūra laukums ir: " + aprekinatTaisnsturaLaukumu(4, 2));
        System.out.println(average(3.4, 3.2, 5.4));

        macamiesMasivus();
        whileCikls();
    }

    public static void whileCikls() {
        int x = 5;
        while (x >= 0) {
            System.out.println("X nav nulle, X = " + x);
            x--; //tas pats kas x=x-1
        }

        int i = 10;
        while (i < 50) {
            System.out.println("I ir " + i);
            i++; //tas pats kas i = i + 1;
        }

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes", "Audi", "Volvo", "BMW", "Nissan", "Mercedes", "Audi", "Volvo", "BMW", "Nissan", "Mercedes", "Audi", "Volvo", "BMW", "Nissan", "Mercedes", "Audi", "Volvo", "BMW", "Nissan", "Mercedes", "Audi"};

        System.out.println("kods sākās");
        int z = 0;
        while (z < cars.length) {
            System.out.println(cars[z]);
            z = z + 1;
        }
        System.out.println("kods turpinās");


        //uzdevums 2 - pieprasīt no lietotāja ievadīt veselu skaitli, kamēr skaitli ir pozitivi
        //saskaitīt tos un izvadīt uz ekrāna summu, ja ir ievadīta 0 vai negatīvs(Jāizmanto scanner)

        Scanner ievade = new Scanner(System.in);

        System.out.println("Ievadi skaitli...");
        int number = ievade.nextInt();
        int summa = 0;
//        while (number > 0) {
//            int test = 5;
//            summa = summa + number;
//            System.out.println("Ievadi skaitli...");
//            number = ievade.nextInt();
//        }
//        System.out.println("summa ir:" + summa);
//
//        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
//
//        int m = 0;
//        while (m < kartis.length) {
//            System.out.println(kartis[m]);
//            m++;
//        }
//        int q = 0;
//        do {
//            System.out.println("TEST TEST TEST");
//            q++;
//        } while (q < 10);
//
//        Scanner scanner = new Scanner(System.in);
//        String parole = "SuperSecretPassword123";
//        String ievaditaParole;
//        do {
//            System.out.println("Ievadi paroli");
//            ievaditaParole = scanner.next();
//            System.out.println("Pārbaudām paroli");
//        } while (!ievaditaParole.equals(parole));
//
//        System.out.println("Pareiza parole");

        char[] letter = {'I', 'g', 'o', 'r', 's'};
        for (char name : letter) {
            System.out.print(name);
        }

        char[] vards = {'N', 'A', 'T', 'Ā', 'L', 'I', 'J', 'A'};
        for (char mansVards : vards) {
            System.out.println(mansVards);
        }

        String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (String vienaKarts : kartis2) {
            System.out.println(vienaKarts);
        }




        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }

        for (int v = 0; v <= 20; v = v + 2) {
            if (v == 6) {
                break;
            }
            System.out.println(v);
        }

        long[] telefonaNumuri = {222222, 333333, 444444, 555555, 534534543};

        for (long masivatelefons : telefonaNumuri) {
            System.out.println(masivatelefons);
        }

        // Šobrīd ciematā ir iespēja iegādāties mājas ar mājas numuriem no 1 līdz 50.
        // Pircējs  vēlas iegādāties māju ciematā, bet viņš nevēlas māju, kuras numurs dalās ar 3 vai 5.
        // Cik māju numuri atbilst prasībām?

        int count = 0;
        for (int j = 1; j <= 50; j++) {
            if (!(j % 3 == 0 || j % 5 == 0)) {
                count++;
            }
        }

        System.out.println("Der " + count + " Māju numuri");

        //nodefinēt savu vārdu kā masīvu ar burtiem(char)
        //izmantojot foreach ciklu, izvadīt savu vārdu vienā rindā uz ekrāna


    }

    public static void macamiesMasivus() {
        //masīva izmērs ir 3
        String dogName;
        String dogname2 = "Reksis";

        int[] menesaTerini = {100, 40, 23, 44, 55, 200};

        String[] produktuSaraksts = {"Piens", "Maize", "Olas"};

        System.out.println(produktuSaraksts[0]);
        System.out.println(produktuSaraksts[1]);
        System.out.println(produktuSaraksts[3]);
        System.out.println(menesaTerini[3]);

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); //desa

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        System.out.println("Masiva garums ir:" + cars.length);

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        cars[1] = "Audi";
        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);


    }

    public static double average(double x, double y, double z) {
        return x + y + z;
    }

    public static void printCard2(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums:" + vecums);
        System.out.println("$$$$$$$$$$$$$");
    }


    public static int aprekinatTaisnsturaLaukumu(int platums, int garums) {
        return platums * garums;
    }

    public static void printNewLine() {
        System.out.println("\n");
    }

    public static void printCard() {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println("JURIS KREILIS");
        System.out.println("Rīga");
        System.out.println("Vecums:" + 50);
        System.out.println("$$$$$$$$$$$$$");
    }


}
