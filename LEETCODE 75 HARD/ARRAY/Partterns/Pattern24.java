// Q24. Write a java program to print this pattern.

	// #
	// #	*
	// #	*	#
	// #	*	#	*
	// #	*	#	*	#
	// #	*	#	*
	// #	*	#	
	// #	*
	// #	



  class Pattern24 {
	  public static void main (String [] args) {
		for(int i =1;i<=9;i++) {
			for(int j = 1;j<=5;j++) {
				if(j<=i && j<=10-i) {
				if(j == 1||j==3||j==5) {
					 System.out.print("  #");
				}
				
				else {
					System.out.print("  *");
				}
				}
			}
			System.out.println();
		}

    }
 }