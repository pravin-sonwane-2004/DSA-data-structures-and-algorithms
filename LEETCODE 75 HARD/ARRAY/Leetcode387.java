// s = "loveleetcode" = 2
// s = "leetcode" = 0
// s = "aabb" = -1;

import java.nio.channels.Pipe.SourceChannel;

class Leetcode387 {

        public int retN (String str) {
       
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }
    void main() {
        Leetcode387 obj = new Leetcode387();

        String str = "aabb";

        int res = obj.retN(str);
        System.out.println(res);
    }
}