package Math;

public class Leetcode258 {
    public int addDigits(int num) {
        int lastDigit =0;


        while(num>=10) {
            int add =0;
            while (num>0) {
                lastDigit = num %10;
                add += lastDigit;
                num = num/10;
            }
            num = add;

        }
        
        return num;
    }
    void main() {
        int num = 38;
        Leetcode258 obj = new Leetcode258();
        int res = obj.addDigits(num);
        System.out.println(res);
    }
}
