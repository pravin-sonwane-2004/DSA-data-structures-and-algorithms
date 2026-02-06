// Q36. Write a java program to print this pattern.
			
			// 1
		//  1     2
	 //  1     2	 3
    // 1	 2	  3     4
   //1    2 	3	 4	  5


class Pattern36 {
	public static void main (String args [] ) {
		   for(int i = 1;i<=5;i++) {
		   boolean b = true;
		   int count = 1;
				  for(int j = 1;j<=9;j++) {
						if(j>=6-i && j<5+i) {
							if(b) {
							System.out.print(count);
							count++;
							b=false;
							}
							else {
									System.out.print(".");
								b=true;
							}
						}
						else {
						System.out.print(" ");

						}
					
				  }
				  System.out.println();
		   }
	}
}