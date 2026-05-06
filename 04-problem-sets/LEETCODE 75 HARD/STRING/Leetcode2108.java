class Leetcode2108 {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++) {
            int start =0;
            int end = words[i].length()-1;
            boolean isit = true;
           while(start < end) {
                if(words[i].charAt(start) != words[i].charAt(end)) {
                    isit = false;
                    break;
                }

                start++;
                end--;
            }
            if(isit) {
            return words[i];
            }
        }
        return "";
    }
}