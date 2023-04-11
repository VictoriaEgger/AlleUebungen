package MatheRechner;

public class MatheRechner {
    int a = 10;
    int b = 5;

    public MatheRechner(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void addition (int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public void subtraieren (int a, int b){
        int sum = a - b;
        System.out.println(sum);
    }
}
