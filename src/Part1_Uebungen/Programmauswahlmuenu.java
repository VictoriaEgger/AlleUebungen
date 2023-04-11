package Part1_Uebungen;

import java.util.Locale;
import java.util.Scanner;

public class Programmauswahlmuenu {
    public static void main(String[] args) {
        //reverseWord();
        //oddNumber();
        //fakultaet();
        vowels();
    }

    public static void reverseWord() {
        System.out.println("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        word = word.toLowerCase(Locale.ROOT);

        StringBuilder input1 = new StringBuilder();
        input1.append(word);
        input1.reverse();
        System.out.println("Reverse word: " + input1);

    }

    public static void oddNumber() {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Gerade Zahl");
        } else {
            System.out.println("Ungerade Zahl");


        }

    }

    public static void fakultaet() {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 1;
        int sum = 1;

        while (counter <= number) {
            sum = sum * counter;
            counter++;
        }
        System.out.println(sum);
    }

    public static void vowels() {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch=='u') {
                counter++;
            }

        }
        System.out.println(counter);
    }
    }
