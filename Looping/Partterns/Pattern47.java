
// Q47. Write a java program to print this pattern.

					// 1
				// 1		2
			// 1	   2		3
		// 1	   2		3		4
	// 1	   2	   3		4		5
		// 1	   2		3		4
			// 1	   2		3
				// 1		2
					// 1



class Pattern47 {
		  public static void main(String [] a) {
			   for(int i=1;i<=9;i++) {
				   int count = 1;
				   boolean flag = true;
					  for(int j=1;j<=9;j++) {
						  
						   if(j>=6-i && j<=4+i && j<=14-i && j>=i-4 && flag) {
							   
										flag = false;
							   System.out.print(count++ + " ");
					
							  
						   }
						  
						   else {
							   System.out.print(". ");
								flag = true;
						   }    
					  }
					  System.out.println();
			   }
		  }
}