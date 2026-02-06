// Q64. Write a java program to print this pattern.

	// E	E	E	E	E
	// D	D	D	D
	// C	C	C
	// B	B
	// A


class Pattern64 {
	public static void main(String [] a) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				char ch = (char) ('E'+1 -i);
				if(j<=6-i) {
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