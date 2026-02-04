package WhileLoop;
//Write a java program to find the sum of all even numbers between 1 to n.

public class SumOfAllEvenNumbersFrom1toN {

    public static void main (String [] args) {
        int res = 0;
        int n = 10;
        while(n>0) {
            if(n%2==0) {
                res +=n;
            }
            n--;
        }
        System.out.println(res);
    }
}
