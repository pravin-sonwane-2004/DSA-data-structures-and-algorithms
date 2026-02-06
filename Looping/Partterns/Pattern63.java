// Q63. Write a java program to print this pattern.

	// A
	// B	B
	// C	C	C	
	// D	D	D	D
	// E	E	E	E	E


class Pattern63 {
	public static void main(String [] args) {
		  for(int i = 1;i<=5;i++) {
			 for(int j = 1;j<=5;j++) {
			 char ch = (char) ('A' + i -1);
			   if(i>=j) {
				  System.out.print(ch + " ");
			   }
			   else {
				  System.out.print(" ");
			   }
			 }
			System.out.println();
		  }
	}
}