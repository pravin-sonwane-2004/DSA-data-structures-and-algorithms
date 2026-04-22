package WhileLoop;

import java.util.Scanner;

public class reverseNumberByUser {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int res = 0;
        while(num>0){
             res = num % 10;
             reverse = reverse*10+res;
             num=num/10;
        }
        System.out.println(reverse);
    }
}
