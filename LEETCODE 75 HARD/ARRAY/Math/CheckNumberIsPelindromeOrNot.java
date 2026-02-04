package Math;
/*
Q22. Write a java program to check whether a number is palindrome or not.
 */
public class CheckNumberIsPelindromeOrNot {
    public static void main (String [] args) {
        int number = 12321;
        int oregional = number;
        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }
        if(reversed == oregional )
            System.out.println("it is prlindrome");
        else {
            System.out.println("it is not prlindrome");
        }

    }

}
