// Q19. Write a java program to print this pattern.

	// * * * * * *	
     // * *	* * *        
	  // * * * *
	   // * * *
	    // * *
	     // *




  class Pattern19 {
	  public static void main (String [] args) {
		for(int i =1;i<=6;i++) {
			for(int j = 1;j<=11;j++) {
				if(j<=12-i&&j>=i) {
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