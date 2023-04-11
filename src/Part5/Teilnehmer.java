package Part5;

public class Teilnehmer {

    String name;
    int alter;
    String adresse;
    int counter;


    public void hatFrageGestellt(){
        counter++;
    }

    public void ausgabeFragencounter(){
        System.out.println("Teilnehmer " + name + "hat insgesamt " + counter+" gestellt." );
    }

    public void teilnehmerInfo(){
        System.out.println("Name: " +name+", Alter: " + alter+" , Adresse: " +adresse);
    }
    public Teilnehmer(String name, int alter, String adresse, int counter) {
        this.name = name;
        this.alter = alter;
        this.adresse = adresse;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
