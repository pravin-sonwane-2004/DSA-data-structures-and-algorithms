// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
//return if power of 4
class Practice {

	// public boolean isPowerOfFour(int n) {
	// if(n==1) {
	// return true;
	// }
	// return isPowerOfFour(n/4);
	// }

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