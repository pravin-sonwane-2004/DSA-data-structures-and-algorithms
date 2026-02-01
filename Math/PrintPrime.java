package Math;

class PrintPrime {
	void main() {
		int num = 100;
		
		for(int i=2;i<100;i++) {
			boolean flag = false;
			for(int j=2;j*j<=i;j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
				else {
					flag = true;
				}
				
			}
			if(flag) {
				IO.println(i);
			}
		}
	}
}