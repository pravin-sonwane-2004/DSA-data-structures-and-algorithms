package LinkedList;

public class NewLinkedList {
    Node head;

    static void printLinked(Node head) {
        Node curr = head;
        while (curr != null) {
            IO.println(curr.data);
            curr = curr.next;
        }
    }

    void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void main() {
        NewLinkedList li = new NewLinkedList();
        li.insertAtEnd(5);
        li.insertAtStart(10);
        li.insertAtStart(20);
        li.insertAtStart(30);
        li.insertAtStart(40);
        insertAtStart(15);
        printLinked(li.head);

    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}