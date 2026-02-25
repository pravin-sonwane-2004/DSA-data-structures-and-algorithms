import java.util.*;
class LongestSubstring{
	int returnLength(String s) {
	int left = 0;
	int maxLeng = 0;
	Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(left));	
				left++;
			}
			set.add(s.charAt(i));
			maxLeng = Math.max(maxLeng,i-left+1);
		}
		return maxLeng;
	}
	void main() {
		String s = "abcabcbb";
		IO.println(returnLength(s));
	}
}