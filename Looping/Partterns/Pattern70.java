// Q70. Write a java program to print this pattern.

	// 1	A	2	B	3
	// C	4	D	5	E
	// 6	F	7	G	8
	// H	9	I	10	J
	// 11	K	12	L	13

class Pattern70 {
	 public static void main(String [] a) {
		for(int i=1;i<=5;i++) {
			char ch = 'A';
			int count = 1;
			for(int j=1;j<=5;j++) {
				if(i%2==0) {
					if( j % 2==0) {
						System.out.print(count++);
					}
					else {
						System.out.print(ch++);
					}
					
				}
				else if(j%2== 0) {
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