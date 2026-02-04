// Q40. Write a java program to print this pattern.

					// 1	
				//  2	3	2
			//  3	4	5	4	3
		//  4	5	6	7	6	5	4
	// 5	6	7	8	9	8	7	6	5




  class Pattern40 {
	  public static void main (String [] args) {
				
		for(int i =1;i<=5;i++) {
	  			int count = i;
			for(int j = 1;j<=9;j++) {
				if(j<=4+i && j>=6-i ) {
					if(j<=5) {
						System.out.print(count++ + " ");
					}
					else {
						System.out.print(--count-1 + " ");
					}
				}
				else {
					System.out.print(". ");
				}
			}
			
			System.out.println();
		}
    }
 }