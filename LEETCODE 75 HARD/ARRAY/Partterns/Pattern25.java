
// Q25. Write a java program to print this pattern.

				// *
			// *	*	*
		// *		*		*
	// *			*			*
// *	*	*	*	*	*	*	*	*
	// *			*			*
		// *		*		*
			// *	*	*
				// *


  class Pattern25 {
	  public static void main (String [] args) {
		for(int i =1;i<=9;i++) {
			for(int j = 1;j<=9;j++) {
			if(i==5 || j==5 || j==6-i || j==4+i || i==4+j ||j==14-i) {
				 System.out.print("*");

				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
    }
 }