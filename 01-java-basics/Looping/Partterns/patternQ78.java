// Q78. Write a java program to print this pattern.

// A	B	C	D	E	D	C	B	A	
// A	B	C	D	    D	C	B	A	
// A	B	C    			C	B	A
// A	B     					B	A
// A       							A
// A	B     					B	A
// A	B	C   			C	B	A
// A	B	C	D 		D	C	B	A
// A	B	C	D	E	D	C	B	A


class patternQ78 {
	void main() {
		int k =0;
		for(int i=1;i<=9;i++) {
					char ch = 64;
					for(int j=1;j<=9;j++) {
				k = j<=5?ch++:ch--;
				if(j<7-i || j>3+i ||j<i-3||j>13-i){
					IO.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			IO.println();
		}
	}
}