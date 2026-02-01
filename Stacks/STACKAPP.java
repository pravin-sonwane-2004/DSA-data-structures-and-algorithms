import java.util.*;

class STACKAPP {
	void main() {

	Scanner sc = new Scanner(System.in);
	IO.println("Enter The Size Of Array");
	int size = sc.nextInt();
	int stack [] = new int [size];
	int top=-1;
	int capacity = stack.length-1;
	int choice = 0;

	do {
		
	IO.println("1. push");
	IO.println("2. pop");
	IO.println("3. peek");
	IO.println("4. display");
	IO.println("5. Exit");
	IO.println();
	IO.println("Enter The Choice : ");
	 choice = sc.nextInt();

		switch (choice) {
			case 1 : if(top == capacity) {
				IO.println("Stack Overflow");
				
			}
			IO.println("Enter The Element");
			stack[++top] = sc.nextInt();
			continue;

			//pop4

			case 2 : if(top ==-1) {
					IO.println("Stack Underflow");
			}
			stack[--top] = sc.nextInt();

			case 3 : if(top == -1) {
					IO.println("Stack Underflow");
					
			}
			IO.println("Element iss " + top);

			case 4 : if(top != -1) {
				for(int i=0;i<stack.length;i++) {
					IO.println(stack[i]);
				}
			}
		}
	}
	while(choice != 5);


}
}