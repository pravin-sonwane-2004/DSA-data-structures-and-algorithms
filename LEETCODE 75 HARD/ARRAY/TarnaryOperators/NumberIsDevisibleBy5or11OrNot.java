package TarnaryOperators;

import java.util.Scanner;

public class NumberIsDevisibleBy5or11OrNot {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(num%5==0&&num%11==0 ? "right number":"Wrong number");
    }
}
