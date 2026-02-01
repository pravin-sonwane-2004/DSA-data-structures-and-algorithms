// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
//return if power of 4
class Practice {

	 public boolean isPowerOfFour(int n) {
		if(n==1) {
			return true;
		}
		return isPowerOfFour(n/4);
		}
	
	void main() {
		int n = 16;
		Practice obj = new Practice();
		IO.println(obj.isPowerOfFour(n));
	}
}