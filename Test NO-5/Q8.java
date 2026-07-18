// Q8. Store N words in a HashMap. Print words whose length is a prime number. 
//     Input: java python sql code spring 
// Output: Words with Prime Length : 

// java 
// python 
// Description: 
// • Store words in a HashMap.  
// • Calculate the length of each word.  
// • Check whether the length is a prime number.  
// • Print all matching words.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q8 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        
        System.out.println("Enter strings: ");
        for(int i = 0; i < n; i++) words[i] = sc.next();
       
        Map<Integer,String>map = new HashMap();

        for(int i=0;i<words.length;i++) {
            map.put(words[i].length(),words[i]);
        }
        IO.println("Words with prime length : ");
        for(Map.Entry<Integer,String> e : map.entrySet()) {
            if(isPrime(e.getKey())) {
                IO.print(e.getValue());
            }
        }
    }
    boolean isPrime(int n) {
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
