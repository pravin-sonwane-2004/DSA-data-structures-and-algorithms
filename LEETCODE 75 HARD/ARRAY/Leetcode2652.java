
 
class Leetcode2652 {
	void main() {
		int n  = 7;
		 Leetcode2652 obj = new Leetcode2652();
		System.out.println(obj.sumOfMultiples(n));
	}
	
	public int sumOfMultiples(int n) {
        int sum = 0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0 || i%7==0) {
				 sum += i;
			}
		}
		return sum;
    }
}