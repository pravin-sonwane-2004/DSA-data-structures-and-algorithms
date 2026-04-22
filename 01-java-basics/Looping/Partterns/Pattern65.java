// Q65. Write a java program to print this pattern.

						//  A
					//  B	A
				//  C	B	A
			//  D	C	B	A
		// E	D	C	B	A
		
class Pattern65 {
	public static void main(String [] a) {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				char ch = (char) ('A'-1+j);
				if(j<=6-i) {
					System.out.print(ch + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}