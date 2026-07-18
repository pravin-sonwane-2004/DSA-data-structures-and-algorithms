
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        // Loop to print the increasing part
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            for (int j = 1; j < 10; j++) {
                if(j+1==i) {
                    IO.print(i + " ");
                }
            }
            IO.println();
        }
        
        // Loop to print the decreasing part
        // for (int i = n - 1; i >= 1; i--) {
        //     System.out.print(i + " ");
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(i + " ");
        //     }
        //                 IO.print(" ");
        // }
    }
}

