import java.util.Scanner;

public class Q2 {
    void main() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] queue = new int[100];
            System.out.print("Enter number of elements in Queue: ");
            int n = sc.nextInt();
            
            System.out.println("Enter queue elements: ");
            for(int i = 0; i < n; i++) {
                queue[i] = sc.nextInt();
            }
            
            System.out.print("Enter element to remove: ");
            int target = sc.nextInt();
            
            System.out.print("Output - Queue: ");
            for(int i = 0; i < n; i++) {
                if(queue[i] != target) {
                    System.out.print(queue[i] + " ");
                }
            }
        }
    }
}
