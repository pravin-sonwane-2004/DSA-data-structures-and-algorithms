class MyLinkedList {

    private Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
	
	void printTheLL() {
		Node curr= head;
		while(curr != null) {
			IO.println(curr.data);
			curr = curr.next;
		}
		
	}

  void insertAtEnd(int data) {
    Node node = new Node(data);

    // Case 1: list is empty
    if (head == null) {
        head = node;
        return;
    }

    // Case 2: list already has nodes
    Node curr = head;

    while (curr.next != null) {
        curr = curr.next;
    }

    curr.next = node;
}

    void print() {
        Node curr = head;

        while (curr != null) {
            IO.print(curr.data + " -> ");
            curr = curr.next;
        }

        IO.print("null");
        IO.println();
    }
   static MyLinkedList mergeTwoLinkedList(MyLinkedList first, MyLinkedList second) {
        MyLinkedList  merge = new MyLinkedList();
        Node a = first.head;
        Node b = second.head;

      while (a != null && b != null) {
            if (a.data <= b.data) {
                merge.insertAtEnd(a.data);
                a = a.next;
            } else {
                merge.insertAtEnd(b.data);
                b = b.next;
            }
        }

        while (b != null) {
            merge.insertAtEnd(b.data);
            b = b.next;
        }

        return merge;
    }
}

public class LinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList first = new MyLinkedList();
        // MyLinkedList second = new MyLinkedList();

        first.insertAtEnd(10);
        first.insertAtEnd(20);
        first.insertAtEnd(30);
        first.printTheLL();


        // second.insertAtEnd(10);
        // second.insertAtEnd(20);
        // second.insertAtEnd(30);
        // second.print();

        // MyLinkedList merge =  MyLinkedList.mergeTwoLinkedList(first,second);

        // merge.print();
    }
}