class PrimeNumberPrint {
	
	void main () {
		int n = 100;
		
		for(int i=2;i<n;i++) {
			boolean flag = false;
			
			for(int j=2;j<i;j++) {
				if(i%j*j==0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(i);
			}
		}
	}
}