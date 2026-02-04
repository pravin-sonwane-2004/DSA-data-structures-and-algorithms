// Q52. Write a java program to print this pattern.

	// 1	0	0	0	1
	// 0	1	0	1	0
	// 0	0	1	0	0
	// 0	1	0	1	0
	// 1	0	0	0	1


class Pattern52 {
	  public static void main(String [] a) {
			for (int i = 1; i <= 5; i++) {
				for (int j = 1;j<=5; j++) {
					if(j==6-i || j==i) {
							System.out.print("1 ");
					}else {
						
						System.out.print("0 ");
					}
			}
			System.out.println();
			
		}   
	  }
}