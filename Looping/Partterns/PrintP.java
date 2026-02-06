// 1
// 3 3 3
// 5 5 5 5 5
// 3 3 3
// 1

class PrintP {
	void main() {
		int k = 1;
		for(int i=1;i<=5;i++)  {
			for(int j=0;j<k;j++) {
				if(j%2==0) {
					System.out.print(k+" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
			
				if (i < 3)
				k += 2;
			else
				k -= 2;

		}
	}
}