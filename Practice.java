
class Practice {
	  static boolean isPrime(int n) {
		  if(n<=1) return false;
		  if(n==2) return true;
		  if(n%2==0)  return false;
		  for(int i=3;i*i<=n;i++) {
			  if(n % i == 0) {
				  return false;
			  }
		  }
			return true;
	  }
	void main() throws Exception {
		int sum =0;
		for(int i=2;i<100;i++) {
			boolean	isPrime = true;
			for(int j=2;j<i;j++) {
				if(i % j*j == 0) {
					isPrime = false;
					  break;
				}
				
			}
			if(isPrime) {
				sum+=i;
				IO.println(i );
			}
		}
	}
}