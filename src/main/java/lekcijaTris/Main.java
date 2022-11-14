package lekcijaTris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        // sum = sum + number;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ievadi veselu skaitli lielāko par 1");
            number = scanner.nextInt();
            if (number <= 1) {
                continue;
            } else if
            (number % 2 == 0 && number != 2) {
                continue;
            } else if (number % 3 == 0 && number != 3) {
                continue;}
            else if (number % 5 == 0 && number != 5) {
                continue;}
            else {
                System.out.println(number + " ir pirmskaitlis");
            }
            sum = sum + number;
            System.out.println(sum);
        } while (sum < 101);
        System.out.println("Gatavs! Summa ir " + sum);
    }
}
