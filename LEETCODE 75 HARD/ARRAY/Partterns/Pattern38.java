// Q38. Write a java program to print this pattern.
	
	// 1	*	*	*	*
	// 2	2	*	*	*
	// 3	3	3	*	*
	// 4	4	4	4	*
	// 5	5	5	5	5
	

  class Pattern38 {
	  public static void main (String [] args) {
		  int num = 4;
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				if(j<=i) {
				 System.out.print(i+ " ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
    }
 }