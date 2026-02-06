package WhileLoop;

//Write a java program to print all odd numbers between 1 to 100.

public class PrintOddNumbers {
    public static void main (String [] args) {
        int n = 0;
        while(n<100) {
            n=n+3;
            System.out.println(n);
        }
    }
}
