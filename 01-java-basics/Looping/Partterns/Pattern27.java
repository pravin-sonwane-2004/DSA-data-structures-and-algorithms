// Q27. Write a java program to print this pattern.

	// *
	// *	*
	// *	*	*
	// *
	// *	*
	// *	*	*




class Pattern27 {
	public static void main (String [] a) {
		
			for (int i = 1; i <= 6; i++) {
				for (int j = 1;j<=3; j++) {
					
					if(i<=3 && j<=i || i>=4 && j<=i-3) {
						System.out.print("* ");
					}
					
					else
						System.out.print("  ");
			}	
			System.out.println();
			
		}
	}
	
}