public class Leetcode2520 {
        public int countDigits(int num) {
            int val = num;   //121
            int count = 0;   //0
            while (num > 0) {   //true  121 > 0  
                int lastDigit = num % 10;    //1
                if (val % lastDigit == 0) { //121 / 1 ==0
                    count++;     //1
                }
                num = num / num;  //12
            }
            int newCount = count;
            if(count > newCount) {
               count = newCount;
            }
            return count;
        }
    void main() {
        int num = 121;
        Leetcode2520 obj = new Leetcode2520();
        System.out.println(obj.countDigits(num));
    }
}
