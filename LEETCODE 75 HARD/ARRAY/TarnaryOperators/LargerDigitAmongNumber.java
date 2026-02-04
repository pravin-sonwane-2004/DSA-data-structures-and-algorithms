package TarnaryOperators;
/*
Q54. Take a three-digit number and print the larger digit among the
first and last digit using the ternary operator.

 */

public class LargerDigitAmongNumber {
    public static void main (String [] args) {
        int num = 393;
//        int midnum = num%100/10;
        int firstnum = num/100%10;
        int lastnum = num%10;
        String whichIsLarge = firstnum>lastnum ? "first is larger" : firstnum==lastnum ? " Both Are Same" : "Last Is Large";
        System.out.println (whichIsLarge);
    }
    }
