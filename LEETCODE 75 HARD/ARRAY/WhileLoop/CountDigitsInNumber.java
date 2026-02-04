package WhileLoop;

/*
WAP to input number and count its digit.
Input: 12345
 */
public class CountDigitsInNumber {
    public static void main (String [] args) {
        int num = 12345;
        int count =0;
        while(num>0) {
            num = num/10;
            count++;
        }
        System.out.println("count " + count);
    }

}
