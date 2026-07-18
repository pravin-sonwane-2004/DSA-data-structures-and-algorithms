import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter number of elements (N): ");
        int n = scanner.nextInt();
        
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        
        if (n > 1) {
            int lastElement = list.remove(list.size() - 1);
            list.add(0, lastElement);
        }
        
        System.out.print("Rotated List: ");
        for(int num : list) {
            System.out.print(num + " ");
        }
    } 
    
}
