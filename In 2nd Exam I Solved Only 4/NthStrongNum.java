class NthStrongNum {
    int fact(int d) {
        int mul = 1;
        for (int i = 1; i <= d; i++) {
            mul *= i;
        }
        return mul;
    }

    boolean isStrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }
        return sum == num;
    }
    void findNthStrong(int n) {
        int count = 0;
        int currentNum = 1;
        for(int i=1;i<n;i++) {
			if(isStrong(i)) {
				IO.println(i) ;
			}
		}
    }

    public static void main(String[] args) {
        NthStrongNum obj = new NthStrongNum();
        obj.findNthStrong(1001); 
    }
}
