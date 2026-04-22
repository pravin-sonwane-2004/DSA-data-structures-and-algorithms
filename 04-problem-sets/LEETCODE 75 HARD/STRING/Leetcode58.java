class Leetcode58 {
//    public int lengthOfLastWord(String s) {
//        int count = 0;
//        char c [] = new char[s.length()];
//        for(int i =0 ;i<s.length();i++) {
//            c = s.toCharArray();
//            if(c[i]==' ') {
//                count=0;
//            }
//            else {
//                ++count;
//            }
//        }
//        return count;
//    }
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==(' ')) {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
    void main() {
        String s = "Pravin Is Good Gujjy   ";
        IO.println(lengthOfLastWord(s));

    }

}