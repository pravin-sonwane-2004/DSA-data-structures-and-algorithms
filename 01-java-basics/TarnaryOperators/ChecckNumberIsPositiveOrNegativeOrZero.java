package TarnaryOperators;
import java.util.Scanner;
/*
Q34. Write a Java program to check whether a number is positive , negative or zero.

 */
public class ChecckNumberIsPositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num==0?"Number Is 0 " : num < 0 ? "number is negative ":"number is positive");
    }
}

