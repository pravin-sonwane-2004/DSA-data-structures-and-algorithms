// Q9. Store N words in a HashMap. Print the words that contain at least one consecutive 
// repeated character. 
//  Input: apple book java hello moon 
//  Output: Words with Consecutive Repeated Characters: 
// apple 
// book 
// hello 
// moon 
//  Description: 
// • Store words in a HashMap.  
// • Traverse each word character by character.  
// • Print words containing consecutive repeated characters (e.g., "pp", "oo", "ll").  

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9 {
    void main() {
  Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        
        IO.println("Enter strings: ");
        for(int i = 0; i < n; i++) words[i] = sc.next();
       
        Map<Integer,String> map = new HashMap<>();
        for(int i=0;i<words.length;i++) {
            map.put(i,words[i]);
        }
        IO.println();
        IO.println("Repetative strings: ");
        for(Map.Entry<Integer,String> e : map.entrySet()){
            if(isRepetative(e.getValue())) {
                IO.println(e.getValue());
            }
        }
    }
    // boolean isRepetative(String str) {
    //     char c [] = str.toCharArray();
    //     for(int i=0;i<c.length;i++) {
    //         for(int j = i;j<=c.length;i++) {
    //             if(c[j]==c[j-1]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
        private boolean isRepetative(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]==arr[j-1]) return true;
            }
        }
        return false;
    }
}
