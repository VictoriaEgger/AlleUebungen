package Part4_Uebungen;

public class LustigeUebungen {
    public static void main(String[] args) {
        double[][] array = {{8.8, 12}, {134, 67.92, 45, 32.4, 76}, {1}, {0, 0.56}};
double sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++){
                sum = sum + array[row][col];
            }
        }
        System.out.println(sum);
    }
}
