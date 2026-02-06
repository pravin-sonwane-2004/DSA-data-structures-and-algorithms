package WhileLoop;
//Write a java program to print a multiplication table of any number.

public class MultiplicationTableOfNumber {
    public static void main (String [] args) {
        int n = 6;
        int count =0;
        int res = 0;
        while(count<=10) {
            res = count * n;
            System.out.println(count + "*" + n + "=" +res);
            count++;
        }
    }
}
