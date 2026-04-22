// Q78. Write a java program to print this pattern.

	// A	B	C	D	E	D	C	B	A
	// A	B	C	D	  	D	C	B	A
	// A	B	C    			C 	B	A
	// A	B     					B	A
	// A       							A
	// A	B     					B	A
	// A	B	C   			C	B	A
	// A	B	C	D 		D	C	B	A   
	// A	B	C	D	E	D	C	B	A   
	
class Pattern78 {
	public static void main(String [] a) {
		 for (int i =1;i<=9;i++) {
			 				 char ch = 'A';
			 for(int j =1;j<=9;j++) {
				 // char ch = (char) ('A'+j-1);
				 if(j<=6-i || j>=4+i || j<=i-4 || j>=14-i) {
					if(j>=5) {
						System.out.print(ch--);
					}
					else if(j<=6) {
							System.out.print(ch++); 
					}
				 }
				 else {
					System.out.print("."); 
				 }
			 }
			 System.out.println();
		 }
	}
}