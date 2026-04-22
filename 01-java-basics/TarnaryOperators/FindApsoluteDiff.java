package TarnaryOperators;
/*
Q51. Problem:
Take two integers m and n. Use the ternary operator to print whether the
absolute difference between them is greater than 10 or not.
Example Input:
m = 25, n = 12
 */

public class FindApsoluteDiff {
    public static void main (String [] args) {
        int m = 12, n = 25;
        int diff = (m-n) < 0 ? -(m-n) : m-n;
        String res = diff>10?"diff is more than 10 = "+diff:"no";
        System.out.println(res);
    }
}
