// Example 1:

// Input: n = 22
// Output: 2
// Explanation: 22 in binary is "10110".
// The first adjacent pair of 1's is "10110" with a distance of 2.
// The second adjacent pair of 1's is "10110" with a distance of 1.
// The answer is the largest of these two distances, which is 2.
// Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.
// Example 2:

// Input: n = 8
// Output: 0
// Explanation: 8 in binary is "1000".
// There are not any adjacent pairs of 1's in the binary representation of 8, so we return 0.
// Example 3:

// Input: n = 5
// Output: 2
// Explanation: 5 in binary is "101".
class Leetcode868 {
	public int binaryGap(int n) {
	   String s = Integer.toBinaryString(n);
	   int maxCount = 0;
	   for(int i=0;i<s.length()-1;i++) {
		   int count = 0;
		   	if(s.charAt(i) != '1') break;
				if(s.charAt(i) == '1')  {
					count = 1;
				}
			for(int j=1;j<s.length();j++) {
				if(s.charAt(j) != '1') {
					++count;
				}           
				else {
					if(count > maxCount) {
						maxCount = count;
					}
					count = 0;
				}
			}
					
		}
		return maxCount;
	   }
	void main() {
		IO.println(binaryGap(13)); //1101
    }
}
	//no this approach doesnt work here we have to check whether its adjacent distance
	// public int binaryGap(int n) {
        // String s = Integer.toBinaryString(n);
	   // int count = 0;
	   // int currCount = 0;
       // for(int i =0;i<s.length();i++) {
			// if(s.charAt(i)=='1') {
				 // ++count; 
			// }
			
			// else {
				// if(currCount < count) {
				// currCount = count;
			// }
			// count = 0;
			// }
       // }
		// if(currCount > 1) return currCount;
			// return 0;
		// }
// }