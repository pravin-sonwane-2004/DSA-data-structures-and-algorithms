// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
import java.util.*; 
class Leetcode125 {
	 // public boolean isPalindrome(String s) {
		 // if(s.length() == 1) {
			 // return true;
		 // }
		// StringBuilder sb = new StringBuilder();
		// for(char c : s.toCharArray()) {
			// sb.append(s.toLowerCase().trim().split("\\s+"));
		// }
		// int start = 0;
		// int end = sb.length()-1;
		// while(start < end ) {
			// if(sb.charAt(start) != sb.charAt(end)) 
			// start++;
			// end--;
			// return false;
		// }
		// return true;
    // }
		
		 public boolean isPalindrome(String s) {
			 String str = "";
			 StringBuilder sb = new StringBuilder();
			for(char c : s.toLowerCase().toCharArray()) {
				if(Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
			}
			int start = 0;
			int end = sb.length()-1;
			while(start<= end ) {
				if(sb.charAt(start) != sb.charAt(end)) {
					return false;
				} 
					start++;
					end-- ;
				
			}
			return true;
		 }
	void main() {
		String s = "A man, a plan, a canal: Panama";
		Leetcode125 l = new Leetcode125();
		IO.println(l.isPalindrome(s));
	}
}