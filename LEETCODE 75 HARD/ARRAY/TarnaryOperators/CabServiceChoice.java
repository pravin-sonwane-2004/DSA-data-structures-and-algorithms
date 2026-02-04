package TarnaryOperators;
import java.util.Scanner;

public class CabServiceChoice { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X < Y) {
                System.out.println("FIRST");
            } else if (Y < X) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }

        sc.close();
    }
}
