// Example 1:
// Input: s = "xyzzaz"
// Output: 1
// Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
// The only good substring of length 3 is "xyz".

// Example 2:
// Input: s = "aababcabc"
// Output: 4
// Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
// The good substrings are "abc", "bca", "cab", and "abc".
 
class Leetcode1876 {
    public int countGoodSubstrings(String s) {
        int count = 0 ;
        for(int i=0;i<s.length()-2;i++) {
            
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);

            if(a != b && b != c && a != c) {
                count++;
            }
        }
        return count;
    }
	void main() {
		 String s = "aababcabc";
		 IO.println(countGoodSubstrings(s));
	}
}