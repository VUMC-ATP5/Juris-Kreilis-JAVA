package lekcijaViens.labDarbs;

public class Main {

    public static void main(String[] args) {
        //int - integer , satur veselu skaitli

        int cikAraIrGradi = 10;

        int vecums = 66;

        int temperatura = -10;
        System.out.println("Ziemā būs: " + temperatura);
        System.out.println("Mans vecums ir: " + vecums);
        int garums = 180;
        System.out.println("Mans garums ir: " + garums);
        int kurpjuIzmers = 44;
        System.out.println("Mans kurpju izmers ir: " + kurpjuIzmers);
        int yearsOfExperience = 5;
        System.out.println("Darba stāžs: " + yearsOfExperience);
        int svars = 80;


        //Maksimālā integer vērtība
        int maxInt = 2147483647;
        //Min integer vērtība
        int minInt = -2147483648;

        //pieņem veselu skaitli no -127 līdz +127
        byte vecumsDivi = 99;

        short latvijasMazpilseta = 17000;

        long zivisOkeana = 21474836499L;


        System.out.println("Svars: " + svars);
        System.out.println("VECUMS:" + vecums + "\nGARUMS: " + garums + "\nKurpju izmers:" + kurpjuIzmers);

        //
        String sunaVards = "Reksis";
        boolean vaiIrPotets = true;

        if (vaiIrPotets == true) {
            System.out.println("Reksis drīkst braukt uz ārzemēm");
        }
        if (vaiIrPotets == false) {
            System.out.println("Reksim ātri jāiet pie vetārsta");
        }

        String teksts = "Suna vārds ir: ";
        System.out.println(teksts + sunaVards);

        String favoriteQuote = "To be or not to be";
        System.out.println(favoriteQuote);

        float apavuIzmers = 44.5F;
        System.out.println("apavu izmers " + apavuIzmers);

        double grauduSvars = 150.3;
        System.out.println("Tika pārdoti  " + grauduSvars + "kg graudi");

        //Šodien ir sestdiena, lielveikals ir atvērts
        boolean isSuperMarketOpen = true;
        //Turpretīm skolas ir slēgtas
        boolean isSchoolOpen = false;

        System.out.println("Vai veikals ir atvērts?" + isSuperMarketOpen);

        boolean isFebruaris = false;
        boolean isLeapYear = true;


        String sunaSkirne = "VAS";
        char valuta = '$';
        char atzime = 'F';
        char dzimums = 'V';

        System.out.println("test" + valuta + atzime + dzimums);
        int a = 5;
        int b = 10;
        int summa;
        summa = a + b;


        System.out.println(summa);

        summa = a + a;
        System.out.println(summa);

        String name = "Juris";
        System.out.println(name);
        name = "Jānis";
        System.out.println(name);

        int x = 10;
        int y = -45;

        int rezultats = x + y;
        System.out.println(rezultats);

        rezultats = x - y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

        rezultats = 10 / 2;
        System.out.println(rezultats);
        rezultats = 13 % 2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/4;
        System.out.println(rezultats);
    }

}
