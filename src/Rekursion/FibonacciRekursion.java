package Rekursion;

public class FibonacciRekursion {
    public static void main(String[] args) {
        int zahl1 = 0;
        int zahl2 = 1;
        System.out.println(fibbonacci(zahl1, zahl2));
    }

    public static int fibbonacci(int zahl1, int zahl2) {
        int summe = 0;

        for (int i = 0; i < 20; i++) {
                summe = zahl1 + zahl2;
zahl2 = summe;
zahl1 = zahl2;
                fibbonacci(zahl2, summe);
            }

            return summe;
        }
    }

