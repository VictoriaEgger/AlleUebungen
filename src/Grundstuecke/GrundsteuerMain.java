package Grundstuecke;

public class GrundsteuerMain {
    public static void main(String[] args) {
        int [][] grundstuecke = {{1,30,40},{2,20,50},{3,10,30}};


        double summe = Grundsteuer.grundsteureBerechnen(grundstuecke);
        System.out.println(summe);
    }
}
