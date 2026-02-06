// Q22. Write a java program to print this pattern.

	// *	*	*	*	*
	  // *	     	   *
	   // *          *
	     // *      *
			 // *  



  class Pattern22 {
	  public static void main (String [] args) {
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=9;j++) {
				if(i==1 || j==10-i ||  j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}

    }
 }