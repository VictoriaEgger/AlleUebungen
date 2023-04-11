package Part1_Uebungen;

import java.util.Scanner;

public class Eingabeauffprderung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome enter your name: ");
        String username = scanner.next();
        System.out.println("Enter you age: ");
        int age = scanner.nextInt();

        System.out.println("Hallo, " + username + "! Du bist " + age + " Jahre alt.");
    }
}
