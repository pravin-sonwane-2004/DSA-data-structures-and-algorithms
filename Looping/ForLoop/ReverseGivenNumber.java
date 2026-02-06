
public class ReverseGivenNumber {
    public static void main (String [] args) {
        int num = 12345;
        int rev = 0;
        int last = 0;
        for(int i = 0;i<num;i++) {
            rev = num%10;
            last = last*10+rev;
            num = num/10;
        }
        System.out.println(last);
    }
}
