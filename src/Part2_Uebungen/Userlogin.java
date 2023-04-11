package Part2_Uebungen;

import java.util.Scanner;

public class Userlogin {
    public static void main(String[] args) {
        String correctUser = "user123";
        String correctPassword = "password123";
int versuche = 4;
        Scanner scanner = new Scanner (System.in);

        String enteredUsername;

        String enteredPassword;

        for (int i = 1; i <= 3; i++){
            System.out.println("Verbleibende Versuche: " + (versuche-i));
            System.out.println("Enter username: ");
            enteredUsername = scanner.next();
            System.out.println("Enter password: ");
            enteredPassword = scanner.next();
            if (i == 3){
                System.out.println("You used up all your tries. Sorry...");
            }
            if ( !(enteredPassword.equals(correctPassword)|| enteredUsername.equals(correctUser))){
                System.out.println("Wrong. Please try again.");
                continue;
            }
            if (enteredPassword.equals(correctPassword)&& enteredUsername.equals(correctUser)){
                System.out.println("Correct! Welcome!");
                break;
            }

        }
    }
}
