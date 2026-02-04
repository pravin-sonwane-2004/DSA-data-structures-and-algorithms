
//Print Fibonacci series up to N terms.
//0 1 1 2 3 5 8
public class PrintFigunacciSeriesUptoN {
    public static void main (String [] args)  {
        int n =8;
        int prev =0;
        int curr =1;
        int next =0;
        System.out.println(prev);
        System.out.println(curr);
        for(int i = 0; i<n;i++) {
        next = prev+curr;
        prev=curr;
        curr=next;
        System.out.println(next);

    }
    }
}
