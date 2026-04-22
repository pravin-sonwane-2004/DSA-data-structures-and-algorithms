// Q68. Write a java program to print this pattern.
	
	// A	1	2	3	4
	// A	B	1	2	3
	// A	B	C	1	2
	// A	B	C	D	1
	// A	B	C	D	E


class Pattern68 {
	public static void main(String [] a) {
		for(int i =1;i<=5;i++) {
			char ch = 'A';
			int count = 1;
		   for(int j=1;j<=5;j++) {
			   if(i>=j) {
				  System.out.print(ch++ + " "); 
			   }       
			   else if(j>=i+1) {
				  System.out.print(count++ + " ");
			   }
			   else {
				  System.out.print(" ");  
			   }
		   }
		   System.out.println();
		}			
	}
}