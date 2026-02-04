

// Q9. Write a java program to print this pattern.
			
			// *
		 // *  *  *
      // *  *  *  *  *
   // *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *  *


class PatternQ_9 {
	public static void main (String [] a) {
			
				for (int i = 1; i <= 5; i++) {
					for (int j = 1;j<=9; j++) {
						
						if(j<=4+i && j>=6-i) {
							System.out.print(" *");
						}
						
						else
							System.out.print(" .");
				    }	
				System.out.println();
				}
	}
}