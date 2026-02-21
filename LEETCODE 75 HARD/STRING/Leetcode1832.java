	import java.util.*;
	class Leetcode1832 {
		// boolean checkIfPangram(String s) {

			// if (s.length() < 26) return false;

			// Set<Character> set = new HashSet<>();

			// for (int i = 0; i < s.length(); i++) {
				// set.add(s.charAt(i));
			// }

			// return set.size() == 26;
			// }
			//without using set 
			boolean checkIfPangram(String s) {
				boolean [] b = new boolean[26];
				int a = 0;
				for(char c = 'a'; c<='z';c++ ) {
					a += c;
				}
				for(int i=0;i<s.length();i++) {
					if(!b[i]) {
						a-=s.charAt(i);
						b[i]=true;
					}
				}
				IO.println(a);
                return a == 0;
            }
		void main() {
			String sentence = "thequickbrownfoxjumpsoverthelazydog";
			Leetcode1832 l = new Leetcode1832();
			IO.println(l.checkIfPangram(sentence));
		}
	}