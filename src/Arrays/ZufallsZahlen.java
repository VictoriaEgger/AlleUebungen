package Arrays;

import java.util.Random;

public class ZufallsZahlen {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random number = new Random();
        for (int i = 0; i < array.length; i++){
            array[i]= number.nextInt(100)+1;
            System.out.println(array[i]);
        }

    }
}
