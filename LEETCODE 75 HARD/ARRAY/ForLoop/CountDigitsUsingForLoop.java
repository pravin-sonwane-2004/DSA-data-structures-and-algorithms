

///Count digits of a number using a for loop.
public class CountDigitsUsingForLoop {
    public static void main (String [] args) {
        int num = 12345;
        int count =0;
        for(;num>0;num=num/10) {
            count++;
            System.out.println(count);

        }

    }
}
