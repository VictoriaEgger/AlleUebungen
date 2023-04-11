package Part2_Uebungen;

import java.util.Scanner;

public class Turmrechnen {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multi = 2;
        int sum = number * multi;

        for (int i = 2; i <= 9; i++){
            System.out.println(number + " * " + multi + " = " + sum);
            sum = number * multi;
            number = sum;
            multi++;
            if (i == 9){
                multi = 2;
                for (int j = 2; j <= 9; j++){
                    System.out.println(number + " / " + multi + " = " + sum);
                    sum = number / multi;
                    number = sum;
                    multi++;
                }
            }
        }
    }
}
