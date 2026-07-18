// Q10. Store N Words in a HashMap and Print Words with Unique Character  Frequencies. 
// Write a Java program to store N words in a HashMap. For each word, calculate the  
// frequency of every character. Print only those words in which the frequency of every 
// distinct character is unique. 
// If two or more characters have the same frequency in a word, that word should not be 
// printed. 
// Input 
// 6 
// aabbccc 
// aabbcc 
// banana 
// abcde 
// mississippi 
// programming 
 
// Output 
// Words with Unique Character Frequencies: 
// aabbccc 
// banana 
// abcde

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q10 {
    void main() {
              Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        
        System.out.println("Enter strings: ");
        for(int i = 0; i < n; i++) words[i] = sc.next();

         Map<Integer,String> map = new HashMap<>();
        for(int i=0;i<words.length;i++) {
            map.put(words[i].length(),words[i]);
        }

        IO.println("Unique Frequencies");
        for(Entry<Integer, String> e : map.entrySet()) {
            if(isUnique(e.getValue())) {
                IO.println(e.getValue());
            }
        }

    }
    boolean isUnique(String str) {
        Map<Character,Integer> map = new HashMap<>();
        char [] c = str.toCharArray();
        for(int i=0;i<str.length();i++) {
            map.put(c[i], map.getOrDefault(c[i], 0)+1);
        }

        for(Entry<Character, Integer> e : map.entrySet()) {
            final int v = e.getValue();
            
            if(e.getValue()==v) {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
