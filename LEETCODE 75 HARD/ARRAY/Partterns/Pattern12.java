  // Q12. Write a java program to print this pattern.

	// #	# 	#	#	#
	// *	*	*	*
	// #	#	#
	// *	*
	// #


  
  
  class Pattern12 {
	  public static void main (String [] args) {
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				if(j<=6-i) {
					if(i==1 || i==3 || i==5) {
					System.out.print("  #");
					}
					else {
				System.out.print("  *");

					}
				}
				else {
					System.out.print(" .");
				}
			}
			System.out.println();
		}

    }
 }