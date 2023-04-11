package Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5,6,7,8,9,10};


     /*   double[] array = {1.1, 1.2, 1.3, 1.4, 1.5};
        double max = array[0];

        for (int i = 0; i < array.length; i ++){
            if(array[i] > max){
                max= array[i];
            }
        }
        System.out.println(max);
      */

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        int sum= 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);

    }
}
