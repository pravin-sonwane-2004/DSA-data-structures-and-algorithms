
// Q34. Write a java program to print this pattern.

	// 1
	// 2	3
	// 4	5	6
	// 7	8	9	10
	// 11	12	13	14	15





  class Pattern34 {
	  public static void main (String [] args) {
		  int count = 1;
		for(int i =1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				if(j<=i ) {
				 System.out.print(count++ + "  ");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
    }
 }