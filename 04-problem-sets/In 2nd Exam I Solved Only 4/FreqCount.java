// Q1. Write a java program to find the frequency of each digit in a given integer number.

class FreqCount {
	void main() {
		int num = 12244566;
		int newN = num;
		int count = 0;
		for(int i=1;i<=9;i++) {
			num = newN;          
			count = 0;

			while(num>0) {          
				int lastD = num %10;         
				if(lastD == i) {             
					count++;                     
				}
				else {
					if(count>0) {
						System.out.println(i + " -> " + count);
					}
					count = 0;
				}
				num = num/10;                      
			}
			if(count>0) {
				System.out.println(i + " -> " + count);
			}
		}
		
	}
}