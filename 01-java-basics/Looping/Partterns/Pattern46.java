// Q46. Write a java program to print this pattern.

					// 1
				// 2		2
			// 3				3
		// 4						4
	// 5								5
		// 4						4
			// 3				3
				// 2		2
					// 1



class Pattern46 {
		 public static void main (String [] a) {
        for (int i = 1; i <= 9; i++) {
			int num = i<=5 ? i : 10-i;  //1,2,3,4,5,4,3,2,1...
            for (int j = 1; j <= 9; j++) {
			   if(j==4+num || j==6-num) {
				   System.out.print(num);
			   }
			   else {
				   System.out.print(" ");
			   }
            }

            System.out.println();
        }
    
	}
}