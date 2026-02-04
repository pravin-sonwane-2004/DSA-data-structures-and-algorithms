class Leetcode326 {
	void main () {
	int n = 27;
		Leetcode326 obj = new Leetcode326();
		System.out.println(obj.isPowerOfThree(n));
	}
   public boolean isPowerOfThree(int n) {
    if (n <= 0) return false;
    while (n % 3==0) {                   //3 % 3 ==0 ,true /
        n /= 3;                   		//n=3/3 =1
     }
     return n == 1;
    }
}