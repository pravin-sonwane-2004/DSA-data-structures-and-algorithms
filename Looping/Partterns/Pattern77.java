// Q77. Write a java program to print this pattern.

	// A 	B 	C 	D
	// A     		D
	// A			D
	// A	B	C	D	


class Pattern77 {
	public static void main(String [] a) {
		for(int i =1;i<=4;i++)   {
			for(int j =1;j<=4;j++) {
				char ch = (char) ('A' + j-1);
				if(j==1 || j==4 || i==1 || i==4)  {
					 System.out.print(ch++ + "\t");
				}
				else {
					 System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}