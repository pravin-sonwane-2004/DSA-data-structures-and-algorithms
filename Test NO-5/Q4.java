import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        
        System.out.println("Enter strings: ");
        for(int i = 0; i < n; i++) words[i] = sc.next();
        
        // Used to track which strings are printed
        boolean[] printed = new boolean[n];
        int groupCounter = 1;
        
        for(int i = 0; i < n; i++) {
            if (printed[i]) continue;
            
            System.out.println("Group " + groupCounter++);
            System.out.print(words[i] + " ");
            printed[i] = true;
            
            String chars1 = getSortedChars(words[i]);
            
            for(int j = i + 1; j < n; j++) {
                if (!printed[j]) {
                    String chars2 = getSortedChars(words[j]);
                    if (chars1.equals(chars2)) {
                        System.out.print(words[j] + " ");
                        printed[j] = true;
                    }
                }
            }
            System.out.println();
        }
    }

    private static String getSortedChars(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return new String(arr);
    }
}

