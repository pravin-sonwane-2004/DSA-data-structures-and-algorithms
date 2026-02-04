package WhileLoop;

import java.util.Scanner;
class LargestNumAmong10Num {
	void main() {
		System.out.print("Enter M : ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int count = 0;
		while (count <=10) {
			int n = sc.nextInt();
			if(m>n) {
				System.out.println("Big Number Till Now Is : "+m);
			}
			else {
				System.out.println("Big Number Till Now Is : "+ n);
				m=n;
			}
			count++;
		}
		
	}
}