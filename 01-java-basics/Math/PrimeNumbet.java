//
//class Practice {
//	  static boolean isPrime(int n) {
//		  if(n<=1) return false;
//		  if(n==2) return true;
//		  if(n%2==0)  return false;
//		  for(int i=3;i*i<=n;i++) {
//			  if(n % i == 0) {
//				  return false;
//			  }
//		  }
//			return true;
//	  }
//	void main() throws Exception {
//		// int n = 16;
//		Practice obj = new Practice();
//		int n = 100;
//		for(int i =0;i<n;i++) {
//		if(isPrime(i)) {
//			IO.println(i);
//
//		}
//		}
//		for(int i=2;i<=n;i++) {
//			boolean flag = true;
//			for(int j =2 ;j*j<=i;j++) {
//				if(i%j == 0) {
//					flag = false;
//					break;
//				}
//				else {
//					flag = true;
//				}
//			}
//			if(flag) {
//				IO.println(i);
//			}
//		}
//	}
//}