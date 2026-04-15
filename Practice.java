import java.util.*;
class Practice {
	void main() {
		PriorityQueue<Integer>  q = new PriorityQueue<>();
		q.add(10);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);

		q.remove();
		q.remove();
		IO.print(q.peek());
		IO.println(q);
	}
}