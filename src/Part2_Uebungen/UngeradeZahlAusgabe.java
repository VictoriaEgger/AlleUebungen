package Part2_Uebungen;

import java.util.Scanner;

public class UngeradeZahlAusgabe {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++){
            if (i % 2 == 0){continue;}
            System.out.println(i);
        }
    }
}
