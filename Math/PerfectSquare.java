class PerfectSquare {
	void main() {
		PerfectSquare obj = new PerfectSquare();
		IO.println(obj.isPerfectSquare(16));
	}
	// this Exceeds time limit
    // public boolean isPerfectSquare(int num) {
        // for(int i=1;i<=num;i++) {
            // if(i*i==num) {
                // return true;
            // }
        // }
        // return false;
    // }
	
	public boolean isPerfectSquare(int num) {
        int start = 1;
    int end = num;

    while (start <= end) {

        int mid = start + (end - start) / 2;
        long square = (long) mid * mid;   

        if (square == num) {
            return true;
        }

        if (square > num) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return false;
}
}