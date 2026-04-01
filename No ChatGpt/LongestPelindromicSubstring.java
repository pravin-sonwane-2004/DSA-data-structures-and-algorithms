public class LongestPelindromicSubstring {
    void main() {
        String s = "babad"; 
        
        char [] arr = new char[s.length()];
        int max = 0;
        int secMax = 0;
        for(int i=0;i<s.length();i++) {
            int start =0;
            int end = s.length()-1;
            while (start <= end) {
                if(s.charAt(start) == s.charAt(end)) {
                    max = Math.max(max,end-start);
                }
                secMax = Math.max(secMax,max);
            }
        }
        IO.println(secMax);
    }
}