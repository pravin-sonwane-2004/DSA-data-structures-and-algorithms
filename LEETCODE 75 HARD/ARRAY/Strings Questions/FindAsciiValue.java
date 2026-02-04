
import java.util.Scanner;

public class FindAsciiValue {
    public static void main (String [] args) {
        char c = ' ';
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        int ascii = (int) c;
        System.out.println(ascii);
    }
}
