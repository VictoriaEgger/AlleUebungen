package Rekursion;

public class FakultätRekursion {
    public static void main(String[] args) {

        System.out.println(fakultät(5));
    }

    public static int fakultät (int zahl) {
        int sum = 0;
        for (int i = 0; i < 20; i++) {

            sum = zahl * fakultät(zahl - 1);
            System.out.println(sum);
            return sum;
        }
        return sum;
    }
}
