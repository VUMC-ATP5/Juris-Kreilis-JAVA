package lekcijaViens.test;



public class Main {



    public static void main(String[] args) {
        int[] skaitluMasivs;
        skaitluMasivs = new int[100];
        int skailti = 1;
        for (int skaitli = 0; skaitli < skaitluMasivs.length; skaitli++) {
            System.out.println("Pāra skaitļi masīvā 100 ir" + (skaitli));
            skaitluMasivs[skaitli] = skailti * 2;
            skailti++;

        }



        System.out.println();


        char[] burti = {'1', '2', '3'};
        int i = 0;

        while (burti.length > i) {
            System.out.println(burti[i]);
            i++;
        }



    }


}
