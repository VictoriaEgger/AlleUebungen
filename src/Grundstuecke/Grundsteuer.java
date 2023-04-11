package Grundstuecke;

public class Grundsteuer {

    public static double grundsteureBerechnen(int[][] grundstuecke){
        double grundsteure = 0;
double summe = 0;
        for (int[] element : grundstuecke){
            int typ = element[0];
            int laenge = element[1];
            int breite = element[2];
            int flaeche = laenge * breite;

            switch (typ){
                case 1: grundsteure = flaeche *3.20;
                break;
                case 2: grundsteure = flaeche * 2.10;
                break;
                case 3: grundsteure = flaeche * 0.90;
                break;
                default:
                    System.out.println("You are stupid");
            }
            summe = summe + grundsteure;
            System.out.println("Die Grundsteuer vom Typ " + typ + " beträgt " + grundsteure);

        }return summe;

    }
}