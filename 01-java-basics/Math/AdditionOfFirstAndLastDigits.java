package Math;
/*
Q23. Write a program to calculate the sum of the first and last digit
of a number without using a loop.
 */

public class AdditionOfFirstAndLastDigits {
    public static void main(String [] args){
        int num = 123;
        int firstD=num/100;
        int lastD=num%10;
        System.out.println(firstD+lastD);
    }
}
