package Rezept;

public class REzeptMain {
    public static void main(String[] args) {
        int anzahlPersonen = 2;

        String[] zutatenNamen = {"Nudeln", "Tomatensauce","Milch","Pamesan"};

        double[][] zutatenMenge = {{300, 1.0},{100,2.0},{50,0.5},{25,1.5}};

Rezepte rezept = new Rezepte(anzahlPersonen,zutatenNamen,zutatenMenge);

rezept.istVorhanden("Tomatensauce");
rezept.kosten();
rezept.kostenProPerson();

    }
}
