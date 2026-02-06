	// 1
	// 3	3	3
	// 5	5	5	5	5	
	// 3	3	3
	// 1
	
class PatternQ41 {
	void main() {
		int k = -1;
		for(int i=0;i<5;i++) {
			
			  k=(i<3)&&(k<5)?k+2:k-2;
			for(int j=0;j<k;j++) {
				IO.print(k);
			}
			IO.println();
		}
	}
}