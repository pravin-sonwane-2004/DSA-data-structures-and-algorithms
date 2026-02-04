public class ImplementingStack {
    int [] stack; //to store elements
    int capacity; //index of top
    int top;   //max size

    void initialize (int size) {
        capacity = size;
        stack = new int[size];
        top = -1;
    }

    void push (int n) {
        if(top == capacity-1) {
            System.out.println("Stack Overflow");
                    return;
        }
        stack[++top] = n;
    }
    int pop () {
        if(top == -1) {
                       System.out.println("Stack Overflow");
            return -1;
        }
        return stack[top--];    //return the decrement top here
    }
    int peek (int n) {
       if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];    
    }
    void display(int n) {

    }
    void main() {

    }
    
}
