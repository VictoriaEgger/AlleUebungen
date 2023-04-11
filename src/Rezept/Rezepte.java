package Rezept;

public class Rezepte {

    int personenZahl;

    String[] zutatenNamen = {"Nudeln", "Tomatensoße"};

    double[][] zutaten = {{300, 1.0}, {100, 2.0}};


    public boolean istVorhanden(String zutat) {
boolean istDa = false;
        for (int i = 0; i < zutatenNamen.length; i++) {

            if (zutatenNamen[i].equals(zutat)) {
                System.out.println("Ist Da");
                istDa= true;
            } else {
                System.out.println("Ist nicht da");
                istDa= false;
            }
        }
        return istDa;
    }

    public boolean laktosefrei(){
boolean gelöscht= false;
        for (int i = 0; i < zutatenNamen.length; i++){
String name = zutatenNamen[i].toLowerCase();
            if (name.contains("milch")|| name.contains("käse")){
                zutaten[i][0] = 0;
                zutaten[i][1] = 0;
                gelöscht = true;
            }
            else {gelöscht = false;}
        }
return gelöscht;
    }

    public double kosten(){
        double summe= 0;
        double preisProEinheit = 0;
        for (int row = 0; row < zutaten.length; row++){
            if (zutaten[row][0] == 0 && zutaten[row][0] == 0){
                preisProEinheit = 0;}
            else { preisProEinheit = zutaten[row][0] / zutaten[row][1];}


        summe *= zutaten[row][0] * preisProEinheit;
        }
        System.out.println(summe);
return summe;

    }

    public double kostenProPerson(){
        return kosten() / personenZahl;
    }

    public void änderePersonenAnzahl(int anzahl){
        if (anzahl >= 0){
            personenZahl = anzahl;
        }

    }





    public Rezepte(int personenZahl, String[] zutatenNamen, double[][] zutaten) {
        this.personenZahl = personenZahl;
        this.zutatenNamen = zutatenNamen;
        this.zutaten = zutaten;
    }

    public int getPersonenZahl() {
        return personenZahl;
    }

    public void setPersonenZahl(int personenZahl) {
        this.personenZahl = personenZahl;
    }

    public String[] getZutatenNamen() {
        return zutatenNamen;
    }

    public void setZutatenNamen(String[] zutatenNamen) {
        this.zutatenNamen = zutatenNamen;
    }

    public double[][] getZutaten() {
        return zutaten;
    }

    public void setZutaten(double[][] zutaten) {
        this.zutaten = zutaten;
    }
}
