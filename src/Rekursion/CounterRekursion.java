package Rekursion;

public class CounterRekursion {
    public static void main(String[] args) {
rekursion(10);
    }


    public static void rekursion(int counter) {

        if (counter == 0){
            return;

        }
        System.out.println(counter);
        counter= counter -1;
        rekursion(counter);

    }
}
