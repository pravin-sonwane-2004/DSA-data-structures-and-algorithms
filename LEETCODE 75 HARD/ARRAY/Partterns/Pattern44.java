// Q44. Write a java program to print this pattern.

		// #	1	#	2	#
		// 3	#	4	#	5
		// #	6	#	7	#
		// 8	#	9	#	10
		// #	11	#	12	#

class Pattern44{
	public static void main(String [] a) {
						int count =  1;
			for(int i = 1;i<=5;i++) {
				
				for(int j =1;j<=5;j++) {   
				if(i%2 == j%2) {
						System.out.print("#  ");
				}
				else {
						 System.out.print(count++ + "  ");
				}
				}
				System.out.println();
			}
	}
}