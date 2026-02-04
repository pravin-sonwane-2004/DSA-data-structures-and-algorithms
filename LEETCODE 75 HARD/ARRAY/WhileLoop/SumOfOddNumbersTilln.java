package WhileLoop;
//Write a java program to find the sum of all odd numbers between 1 to n.
public class SumOfOddNumbersTilln {
    public static void main (String [] args) {
        int n = 6;
        int res =0;
        while(n>0) {
            if(n%2!=0) {
                res +=n;
            }
            n--;
        }
        System.out.println(res);
    }
}
