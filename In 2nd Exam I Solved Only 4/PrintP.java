	// Q5. Write a java program to print this pattern.

class PrintP {
	void main() {
			int n = 5;
		for(int i =1;i<=5;i++) {
			int count=1;
			for(int j=1;j<=10;j++) {
				if(j<=i || j>=11-i){
					if(j<=5){
					IO.print(count);
					++count;
					}else if(j>5){
						--count;
						IO.print(count);
					}
				}
				else {
					IO.print(" ");
				}
			}
			IO.println();
		}
	}
}