

public class SumOfDigits {
    public static void main (String [] args) {
        int num =12345;
        int res =0;
        int addition = 0;
        for(int i = 0;i<num;i++) {
            res = num/10;
            addition += res;
            System.out.println(num);
        }
    }
}
