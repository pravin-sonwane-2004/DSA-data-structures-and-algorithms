// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
// and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
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

//imm still having some problems to understand the difference in characters and the strings 
//ill do my best 

public class Leetcode125_ValidPelindrome {
	  // void main() {
		  // i found it is best way by my logic
		  // String s =  "A man, a plan, a canal: Panama";
			// ArrayList<Character> list = new ArrayList<>();
			// for(char c : s.toLowerCase().toCharArray()) {
				// if(c != ' '  && (c <= 'z' && c >= 'a')) {
					// list.add(c);
				// }
			// }
			 // int start = 0;
			 // int end = list.size()-1;
			 // boolean b = false;
			// while (start <= end) {
				// if(list.get(start) != list.get(end)) {
					// b = true;
				// }
				
				// start++;
				// end--;
			// }
			// if(b) {
				// IO.println("Not A Prlindrome");
			// }
	  // }
	  
	  //here im gonna use chatgpt
	  //i refer to letest solved my leetcode code
	  
	  // void main () {
			// String s =  "A man, a plan, a canal: Panama";
			// StringBuilder sb = new StringBuilder();
			
			// for(char c : s.toLowerCase().toCharArray()) {
				// if(Character.isLetterOrDigit(c)) {
					// sb.append(c);
				// }
			// }
			// IO.println(sb.toString());
			//after this we need to  check only isit  or not
	  // }
}
