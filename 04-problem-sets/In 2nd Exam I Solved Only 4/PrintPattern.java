// Q4. Write a java program to print this pattern.

class PrintPattern {
	void main () {
		 for(int i=1;i<=9;i++){
			 for(int j=1;j<=9;j++) {
				 if(j==5 || j==6-i || j==4+i||j==14-i || j==i-4||i==5) {
					 IO.print("*\t");
				 }
				 else {
					 IO.print("\t");
				 }
			 }
			 IO.println();
		 }
	}
}