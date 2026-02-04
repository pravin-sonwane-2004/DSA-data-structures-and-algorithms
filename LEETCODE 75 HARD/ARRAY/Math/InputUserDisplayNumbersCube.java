package Math;
/*
Q19. Write a Java program that reads a number and displays the cube.
 */

import java.util.Scanner;

public class InputUserDisplayNumbersCube {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        number = sc.nextInt();
        int result = number*number*number;
        System.out.println("Enter Number : " + result);
    }
}
