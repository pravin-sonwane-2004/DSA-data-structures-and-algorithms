// 20. Valid Parentheses
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:
	
// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

// Example 5:

// Input: s = "([)]"

// Output: false

 import java.util.*;
class Leetcode20 {
	 public boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()) {
			if(c=='('|| c=='{' || c=='[') {
				stack.push(c);
			}
		else if(c==')'||c=='}'||c==']') {
			 if(stack.isEmpty()) {
				 return false;
				}
		char topChar = stack.pop();
		        if ((c == ')' && topChar != '(') || (c == '}' && topChar != '{') || (c == ']' && topChar != '[')) {
                    return false; // Mismatched brackets
                }
		}
	 }
	 				return stack.isEmpty();

	 }
		void main() {
			String str = "{}(([))]";
			IO.println(isValid(str));
	}
}