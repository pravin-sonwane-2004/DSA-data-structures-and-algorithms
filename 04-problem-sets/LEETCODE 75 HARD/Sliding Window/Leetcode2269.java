// Leading zeros are allowed.
// 0 is not a divisor of any value.
// A substring is a contiguous sequence of characters in a string.

// Example 1:

// Input: num = 240, k = 2
// Output: 2
// Explanation: The following are the substrings of num of length k:
// - "24" from "240": 24 is a divisor of 240.
// - "40" from "240": 40 is a divisor of 240.
// Therefore, the k-beauty is 2.
// Example 2:

// Input: num = 430043, k = 2
// Output: 2
// Explanation: The following are the substrings of num of length k:
// - "43" from "430043": 43 is a divisor of 430043.
// - "30" from "430043": 30 is not a divisor of 430043.
// - "00" from "430043": 0 is not a divisor of 430043.
// - "04" from "430043": 4 is not a divisor of 430043.
// - "43" from "430043": 43 is a divisor of 430043.
// Therefore, the k-beauty is 2.
 
class Leetcode2269 {
	public int divisorSubstrings(int num, int k) {
		String s = String.valueOf(num); //Integer.toString(num);
		int count =0 ;
		for(int i=0;i<s.length()-k+1;i++) {
			int val = Integer.parseInt(s.substring(i,i+k));
			if(val != 0 && num % val == 0) {
				 count++;
			}
		}
		return count;
	}
	void main() {                              
		int num = 430043; 
		int k= 2;
		  IO.println(divisorSubstrings(num,k));
	}
}