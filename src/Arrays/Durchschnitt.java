package Arrays;

public class Durchschnitt {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum = sum + array[i];
        }
        double durchscnitt = (double)sum / array.length;
        System.out.println(durchscnitt);
    }
}
