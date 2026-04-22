// class Solution {
    // this will not work because list returning wrong output here

    // boolean isPelindrome(String s,int start,int end) {
	// 	while(start<=end) {
	// 		if(s.charAt(start) != s.charAt(end)) {
	// 			   return false;
	// 		}
	// 		start++;
	// 		end--;
	// 	}
	// 	return true;
	// }
    // public String longestPalindrome(String s) {
    //     int max = 0;
    //     int secMax = 0;
    //     List<String> list = new ArrayList<>();
    //     for(int i = 0;i<s.length();i++) {
    //         int end = s.length()-1;  
			
    //             while(i<end) {
	// 				if(isPelindrome(s,i,end)) {
	// 				  list.add(s.substring(i,end+1));
	// 			  }
	// 			  end--;
	// 			  i++;
	// 		}
    //     }
    //     return list.toString();
    // }
        // }
class Solution {

    boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int maxLen = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                if (isPalindrome(s, i, j)) {
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }

        return result;
    }
}