// Q60. Write a java program to print this pattern.

	// A	A	A	A	A
	// B	B	B	B	B
	// C	C	C	C	C
	// D	D	D	D	D
	// E	E	E	E	E


class Pattern60 {
	public static void main (String a [] ) {
		for(int i=1;i<=5;i++) {
				 
			for(int j=1;j<=5;j++) {
				 char ch = (char)('A' + i - 1);
				System.out.print(ch);
			}
			System.out.println();
		}			
	}
}                       