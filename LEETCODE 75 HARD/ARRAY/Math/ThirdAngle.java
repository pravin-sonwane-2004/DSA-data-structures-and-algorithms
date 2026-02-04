package Math;
import java.util.Scanner;

public class ThirdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();

        System.out.print("Enter second angle: ");
        int b = sc.nextInt();

        int third = 180 - (a + b);

        System.out.println("Third angle is: " + third);

        sc.close();
    }
}

