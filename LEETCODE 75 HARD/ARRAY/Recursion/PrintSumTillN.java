
public class PrintSumTillN{
    public static void main(String[] args) {
        int n = 4;
        System.out.println(returnSum(n));
    }
    public static int returnSum(int n) {
        if(n<=1){
            return 1;
        }
        return n+returnSum(n-1);
    }

}