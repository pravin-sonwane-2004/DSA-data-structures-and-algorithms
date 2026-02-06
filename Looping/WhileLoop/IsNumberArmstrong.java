package WhileLoop;

public class IsNumberArmstrong {
    public static void main (String [] args) {
        int num = 153;

        int res = 0;
        int count = 0;
        int qube = 0;
        while(num>0) {
            num = num%10;
            res = num;
            qube = res*res*res;
            num--;
        }            System.out.println(qube);

    }
}
