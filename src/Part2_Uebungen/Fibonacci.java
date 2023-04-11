package Part2_Uebungen;

public class Fibonacci {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int sum = number1 + number2;

        for (int i = 0; i < 20; i++){
            System.out.println(number2);
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;

        }
    }
}
