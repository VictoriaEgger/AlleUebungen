package Arrays;

public class BestimmterBuchstabe {
    public static void main(String[] args) {
        String[] array = {"Sammy", "Kensi", "Jimmy", "Findus", "Lucy"};

        char ch = 'S';

        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == ch) {
                System.out.println(array[i]);
            }
        }
    }
}
