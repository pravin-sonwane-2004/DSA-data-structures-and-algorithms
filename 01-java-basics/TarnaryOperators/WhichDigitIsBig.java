package TarnaryOperators;

/*Q54. Take a three-digit number and print the larger digit among
 the first and last digit using the ternary operator.
 Example:
Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater
Input: num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater

 */


public class WhichDigitIsBig {
    public static void main (String [] args) {
        int digit = 572;
        int first = digit/100;
        int mid = (digit/10)%10;
//        System.out.println(mid);
        int last = digit%10;
        int addition = first+last;
        String res = (mid >= addition) ? "Equal or Greater" : "Not Greater";
            System.out.println(res);
    }
}
