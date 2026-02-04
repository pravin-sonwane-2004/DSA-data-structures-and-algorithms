
// Q73. Write a java program to print this pattern.
		
	// A	B	C	D	E
		// 1	2	3	4
			// A	B	C
				// 1	2
					// A

class Pattern73 {
	 public static void main (String [] a) {
		  for(int i =1;i<=5;i++)   {
			  char ch = 'A';
			  int count = 1;
			  for(int j =1;j<=5;j++) {
					if(j>=i) {
						if(i%2==0) {
							System.out.print(count++);
						}
						else 
						  System.out.print(ch++);
					}
					else {
						System.out.print(" ");
					}
			  }
			  System.out.println();
		  }
	 }
}