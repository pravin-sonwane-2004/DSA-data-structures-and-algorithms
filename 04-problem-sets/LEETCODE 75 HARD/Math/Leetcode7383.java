public class Leetcode7383 {
    static void main(String[] x) {
        // Practice p = new Practice();
        // IO.println(p.mirrorDistance(25));
    }

    public int mirrorDistance(int n) {
        return Math.abs(reverse(n) - n);

    }

    int reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int lastD = n % 10;
            reverse = reverse * 10 + lastD;
            n /= 10;
        }
        return reverse;
    }
}
