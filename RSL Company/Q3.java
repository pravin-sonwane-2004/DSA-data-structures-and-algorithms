// Q3. Write a Java program to partition a string such that every substring is a palindrome. 
// Description 
// • Return all possible palindrome partitions  
// • Use backtracking logic  
// Input :- str = "aab" 
// Output :- [["a","a","b"],["aa","b"]] 

public class Q3 {
    void main() {
        String str = "aab";

        for(int i=0;i<str.length();i++) {
           
        }

    }
    boolean isPelindtome(String str) {
        int start =0;
        int end = str.length();

        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
