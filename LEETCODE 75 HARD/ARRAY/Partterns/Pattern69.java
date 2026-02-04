
// Q69. Write a java program to print this pattern.

	// 1
	// A	B
	// 1	2	3
	// A	B	C	D
	// 1	2	3	4	5

class Pattern69 {
	  public static void main(String [] args) {
			for(int i=1;i<=5;i++) {
				int count = 1;
				char ch = 'A';
				for(int j=1;j<=5;j++) {
					if(i>=j) {
						   if(i%2==0) {
							  System.out.print(ch++ +" ");  
						   }
						   else {
							  System.out.print(count++ +" "); 
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