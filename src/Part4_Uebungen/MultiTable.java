package Part4_Uebungen;

public class MultiTable {
    public static void main(String[] args) {
        int[][] multiTable = new int[10][10];

        for (int row = 0; row < multiTable.length; row++){
            for (int col = 0 ; col < multiTable[row].length; col++){
                multiTable[row][col] = (row+1) * (col+1);
                System.out.print(multiTable[row][col] + "\t ");

            }
            System.out.println();
        }
    }
}
