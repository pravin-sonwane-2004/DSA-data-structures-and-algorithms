// Q50. Write a java program to print this pattern.

				 // 1
			 // 2	2
		 // 3	3	3
	 // 4	4	4	4
		 // 3	3	3	
			 // 2	2
				 // 1



  class Pattern50 {
	  public static void main (String [] args) {
		for(int i =1;i<=7;i++) {
			int count = i<=4 ? i : 8-i;
			for(int j =1;j<=4;j++) {
				if(j>=5-i && j>=i-3) {
				 System.out.print(count);
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
    }
 }