package Math;

public class CalculateIntegersSum {
    public static void main(String [] args) {
        int input = 123;
        int sum = 0;
        while(input > 0) {
            int res = input % 10;
            sum += res;
            System.out.println(sum);
        }
    }
}
