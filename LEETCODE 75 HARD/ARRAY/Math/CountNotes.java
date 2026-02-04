package Math;

public class CountNotes {
    public static void main (String [] args) {
        int amount = 2528;
        int[] notes = {500, 100, 50, 20, 10, 5, 2, 1};
        for(int n : notes) {
            int count = amount/n;
            amount = amount%n;
            System.out.println(n + " = " + count);

        }
    }

}
