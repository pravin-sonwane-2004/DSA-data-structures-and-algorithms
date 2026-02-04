// Q67. Write a java program to print this pattern.

	//  A	B	C	D	E
	  //  A	  B	  C   D
		//  A	B	C
		   // A   B
			 // A
			
	class Pattern67 {
		 public static void main(String [] a) {
			 for(int i =1;i<=5;i++) {
				 boolean flag = true;
				 char ch = 'A';
				for(int j=1;j<=9;j++) {
				   if((j>=i && j<=10-i) && flag) {
					   System.out.print(ch++);
					   flag = false;
				   }
				   else {
						System.out.print(" ");
						flag = true;
				   }
				}
					System.out.println();
			 }
		 }
	}