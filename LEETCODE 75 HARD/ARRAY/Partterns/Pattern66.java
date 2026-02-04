// Q66. Write a java program to print this pattern.

		   // A
		 // A   B
	   // A   B	  C
	 // A	B	C	D
   // A	  B	  C   D	  E


class Pattern66 {
	public static void main(String [] a) {
		for(int i=1;i<=5;i++) {
			boolean flag = true;
			char ch='A';
			for(int j=1;j<=9;j++) {
				if((j>=6-i && j<=4+i) && flag) {
					System.out.print(ch++ + "");
					flag = false;
				}
				else {
					System	.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}