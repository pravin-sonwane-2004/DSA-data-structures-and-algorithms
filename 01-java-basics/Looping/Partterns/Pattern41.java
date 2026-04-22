
// Q41. Write a java program to print this pattern.

	// 1
	// 3	3	3
	// 5	5	5	5	5	
	// 3	3	3
	// 1


class Pattern41 {
	public static void main (String args [] ) {
		int count = 1;
		for(int i=1;i<=5;i++) {
			int val = i<=3 ? 2*i-1 : 2*(5-i)+1;
			for(int j=1;j<=val;j++) {
				if(j<=val) {
					if(val %2 !=0) {
						System.out.print(val);
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