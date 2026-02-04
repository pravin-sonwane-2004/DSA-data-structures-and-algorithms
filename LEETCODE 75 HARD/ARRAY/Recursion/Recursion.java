

public class Recursion {
    public static void main (String [] args) {
        int n = 5;
        reverse(n);
    }
    public static void reverse (int n) {
        if(n==1) {
            System.out.println(n + " ");
            return;
        }


        System.out.println(n);
        reverse(n-1);


    }
}
