// Q59. Write a java program to print this pattern.

// 1        							1
// 1	2							2	1
// 1	2	3					3	2	1
// 1	2	3	4			4	3	2	1
// 1	2	3	4	5	5	4	3	2	1


class Pattern59 {
	public static void main(String [] a) {
		for(int i=1;i<=5;i++) {     	
			int count = 1;
			for(int j=1;j<=10;j++) {
				if(j>=11-i || j<=i) {
					if(j<5) {
						System.out.print(count++);
					}
					else if(j==5 || j==6) {
						 System.out.print(count = 5);
					}
					else if(j>5) {
						count--;
						System.out.print(count);
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