package Part1_Uebungen;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scannerBank = new Scanner(System.in);
        System.out.println("Enter your account balance: ");
        double balance = scannerBank.nextDouble();


        System.out.println("Menu: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw ");
        System.out.println("3. Check balance");
        System.out.println("4. Exit ");
        Scanner scannerChoice = new Scanner(System.in);
        int choice = 0;


        while (choice != 4) {
            System.out.println("Enter your choice: ");
            choice = scannerChoice.nextInt();
            if (choice < 1 || choice >= 5) {
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to DEPOSIT: ");
                    double deposite = scannerBank.nextDouble();
                    balance = balance + deposite;
                    System.out.println("New balance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to WITHDRAW: ");
                    double withdraw = scannerBank.nextDouble();
                    balance = balance - withdraw;
                    System.out.println("New balance: " + balance);
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Goodbye");

            }
        }
    }
}
