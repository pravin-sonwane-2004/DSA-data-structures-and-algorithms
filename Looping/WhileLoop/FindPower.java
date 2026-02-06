package WhileLoop;

public class FindPower {
    public static void main (String [] args) {
    int base = 5;
    int res = 1;
    int pow = 3;
    while(pow>0) {
        res = res*base;
        pow--;
    }
    System.out.println(res);
    }
}
