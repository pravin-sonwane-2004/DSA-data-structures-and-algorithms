// Q79. Write a java program to print this pattern.

	// A
	// B	C
	// C		D
	// D			E
	// E	F	G	H	I

class Pattern79 {
	public static void main(String [] args) {
		 for (int i =1;i<=5;i++) {
			 		 char ch = 'A';
			 for(int j =1;j<=5;j++) {
				if(j==1 || j==i || i==5) {
					 System.out.print(ch++);
				}
				 else {
					System.out.print("."); 
				 }
			 }
			 System.out.println();
		 }
	}
}