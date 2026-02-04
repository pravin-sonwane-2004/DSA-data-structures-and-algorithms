 /*
	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D

*/

class CharPrint {
	void main () {
		for(int i=1;i<=7;i++) {		
		char ch = 'D';

			for(int j = 4;j>0 ; j--) {
				if(j<=i && j<=8-i) {
					System.out.print(ch-- + " ");
				}
			}
			System.out.println();

		}
	}
}