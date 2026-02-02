import java.util.*;

class STACKAPP {
	int stack [];
	int top;
	int capacity;
	
	Scanner sc = new Scanner(System.in);
	
	void initiate () {
		
	int sizeArr = sc.nextInt();
		stack = new int[sizeArr];
		top = -1;
		capacity = stack.length-1;
	}
	void push() {
		if(top == capacity) {
			IO.println("Stack is Overflow");
			return;
		}
		for(int i=0;i<capacity;i++) {
		stack[++top] = sc.nextInt();
		}
	}
	int pop () {
	   if(top==-1) {
			IO.println("Stack Is UnderFlow");
			return -1;
	   }
	   return stack[--top];
	}
	int peek () {
		 if(top==-1) {
			IO.println("Stack Is UnderFlow");
			return -1;
	   }
	   return stack[top];
	}
	void display() {
		if(top == -1) {
			IO.println("stack is underflow");
			return;
		}
		for(int i =top;i>0;i--) {
			IO.println(stack[i]);
		}
	}

	void main() {
		
	}
}