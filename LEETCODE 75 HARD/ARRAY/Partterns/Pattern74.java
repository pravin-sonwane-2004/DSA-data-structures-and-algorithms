// Q74. Write a java program to print this pattern.

// A
// A	B	A
// A	B	C	B	A
// A	B	C	D	C	B	A
// A	B	C	D	E	D	C	B	A


class Pattern74 {
	public static void main(String [] args) {
		  for(int i =1;i<=5;i++)   {
			  char ch = 'A';
			  for(int j =1;j<=9;j++) {
					if(j<=2*i-1) {
						if(j<=i) {
						System.out.print(ch++);	
						}
						
						
					}
					else {
						System.out.print(" ");
					}
			  }
			  System.out.println();
		  }
	}

}
