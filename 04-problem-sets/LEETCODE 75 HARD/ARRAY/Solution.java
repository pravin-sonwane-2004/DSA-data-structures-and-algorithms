class Solution {

    void main() {
        // int n = 16;
        // Practice obj = new Practice();
        // IO.println(obj.isPowerOfFour(n));

        int n = 100;
        for (int i = 2; i < n; i++) {
            boolean flag = false;
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                IO.println(i);
            }
        }
    }
}