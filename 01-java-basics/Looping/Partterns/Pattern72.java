// Q72. Write a java program to print this pattern.

	// A								I
		// B						H
			// C				G
				// D		F
					// E	

class Pattern72 {
	  public static void main(String [] a) {
		for(int i =1;i<=5;i++) {
			for(int j =1;j<=9;j++) {
				char ch = (char) ('A' + j -1);
				if(i==j || j==10-i) {
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}			
		  
	  }
}