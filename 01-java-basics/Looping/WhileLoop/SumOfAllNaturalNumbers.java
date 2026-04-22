package WhileLoop;
//Write a java program to find the sum of all natural numbers between 1 to n.


public class SumOfAllNaturalNumbers {
    public static void main (String [] args) {
        int n = 555;
        long res = 0;
        while(n>0) {
            res = res+n;
            n--;
        }
        System.out.println(res);
    }
}
