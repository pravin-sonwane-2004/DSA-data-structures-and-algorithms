// Q55. Write a java program to print this pattern.

					//  1
				// 1	2	1	
             // 1  2	3	2	1
          // 1	2  3	4	3	2	1
 			 // 1  2	3	2	1	
                // 1	2	1	
                     // 1


class Pattern55 {
		public static void main(String [] args) {
			for(int i =1;i<=7;i++) {
				int count =1;
			for(int j = 1;j<=7;j++) {
				if(j>=5-i&&j<=3+i && j<=11-i && j>=i-3) {
					if(j<=4) {
						System.out.print(count++ + " ");
					}
					else {
						System.out.print(--count-1 + " ");
					}
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		} 
		}
}