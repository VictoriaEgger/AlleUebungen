package Part4;

public class MultiArray {
    public static void main(String[] args) {

        int[][][][] arr = new int[4][3][2][2];
        int elementCounter=0;

        for (int i = 0; i< 4;i++){
            for (int j = 0; j< 3;j++){
                for (int k = 0; k< 2;k++){
                    for (int l = 0; l< 2;l++){
                        elementCounter++;
                    }
                }
            }
        }

        int sum = 0;
        for (int[][][]i : arr){
            for (int[][] j : i){
                for (int[] k : j){
                    for (int l : k){
                        sum = sum + l;
                    }
                }
            }
        }
        System.out.println(elementCounter);



    }
}
