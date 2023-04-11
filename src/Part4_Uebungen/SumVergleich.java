package Part4_Uebungen;

public class SumVergleich {
    public static void main(String[] args) {
        int[][] array = {{2, 5, 3, 2}, {6, 4, 2}, {2, 10}, {2, 2, 2, 6}};
        int[] reihenzahl = new int[array.length];
        int counter = 0;
        for (int row = 0; row < array.length; row++) {
            int reihe = 0;

            for (int col = 0; col < array[row].length; col++) {
                reihe = reihe + array[row][col];

            }

            reihenzahl[counter] = reihe;
            counter++;
            System.out.println(reihe);

        }



        if (reihenzahl[0] == reihenzahl[1] && reihenzahl[0] == reihenzahl[2] && reihenzahl[0] == reihenzahl[3]) {
            System.out.println("Alles sind gleich");
        } else {
            System.out.println("Alle sind NICHT gleich");
        }

    }
}
