// Q76. Write a java program to print this pattern.

					 // A
				 // #	#	#
			 // A	B	C	B	A
		 // #	#	#	#	#	#	#
	 // A	B	C	D	E	D	C	B	A
		 // #	#	#	#	#	#	#
			 // A	B	C	B	A
				 // #	#	#
					 // A
					 
class Pattern76 {
	public static void main(String[] a) {
		 for(int i =1;i<=9;i++)   {
			 char ch = 'A';
			for(int j =1;j<=9;j++) {
				 if(j>=6-i && j<=4+i && j<=14-i && j>=i-4) {
					 if(i%2==0) {
					System.out.print("#"); 
				 }
				 else if (j<=4) {
					System.out.print(ch++); 
				 }
				 else {
					System.out.print(ch--); 
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