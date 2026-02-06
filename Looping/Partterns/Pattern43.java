// Q43. Write a java program to print this pattern.

	// 1	2	3	4	5
	// 2	2	3	4	5
	// 3	3	3	4	5
	// 4	4	4	4	5
	// 5	5	5	5	5



class Pattern43 {
	public static void main (String args [] ) {
		   for(int i = 1;i<=5;i++) {   
				int count = i;		   
				for(int j = 1;j<=5;j++) {
					if(i<=j) {
					count = j;
					System.out.print(count +" ");
					}
					else if (i>j) {
						count = i;
						  System.out.print(count+ " ");
					}
				}
				System.out.println();
			}
	}
}