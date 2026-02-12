import java.util.*;
class StAckApp {
			int stack [];
			int capacity;
			int top ;
			void intialize (int size) {
				  stack = new int[size];
				  capacity = size-1;
				  top = -1;
			}
			
			void display () {
				if(top != -1) {
					for(int i=top;i>0;i--) {
					IO.println(stack[i]);
				}
				}
				else {
					IO.println("stack underflow");
				}
			}
				
		 // void pop () {
			// if(top != -1) {
				// stack[--top];
			// }
			// else {
				// IO.println("stack underflow");
			// }
		 // }
		 
		void push (int element) {
			if(top != capacity) {
				stack[++top] = element;
			}
			else {
				IO.println("stack overflow");
			}
		 }
		 
		 void peek() {
			if(top != -1) {
				IO.println(top);
			}
			else {
				IO.println("stack underflow");
			}
		}
			
	void main() {
		StAckApp a = new StAckApp();
		Scanner sc = new Scanner(System.in);
		IO.println("Enter The Size Of Array");
		 int size =  sc.nextInt();
		a.intialize(size);

		IO.println("Enter The Choice");
		int choice = sc.nextInt();
	do{
		IO.println("1"+"push");
		switch(choice) {
			
			case 1 :
					IO.println("Enter The Element");
					int element = sc.nextInt();
					a.push(element);
		}
	}
		while(choice !=5);
		}
}