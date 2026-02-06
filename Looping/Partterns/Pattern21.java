
// Q21. Write a java program to print this pattern.

	// *	*	*	*	*
	// *			*	*
	// *		*		*
	// *	*			*
	// *	*	*	*	*



  class Pattern21 {
	  public static void main (String [] args) {
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				if(j==1 || j==5 || i==1 || i==5 || j==6-i) {
					System.out.print("  *  ");
				}
				else {
					System.out.print("  .  ");
				}
			}
			System.out.println();
		}

    }
 }