// Q39. Write a java program to print this pattern.

	// 5	*	5	*	5
	// 4	*	4	*
	// 3	*	3
	// 2	*
	// 1



  class Pattern39 {
	  public static void main (String [] args) {
		for(int i =5;i>=1;i--) {
			for(int j = 5;j>=1;j--) {
				if(j>=6-i) {
					if(j%2==0) {
						System.out.print("*  ") ;
					}
					else {
				 System.out.print(i+"  ");
					}
				}
				else {
					System.out.print(".  ");
				}
			}
			System.out.println();
		}
    }
 }