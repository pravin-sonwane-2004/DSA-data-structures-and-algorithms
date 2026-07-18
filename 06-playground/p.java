import java.util.*;
class p extends Thread {
	 void main() throws Exception{
		
		// Thread t1 = new Thread(()->{
			// for(int i=0;i<100;i++ ){
				// IO.println("from T1 -" + i);
			// }
		// });
		// Thread t2 = new Thread(()->{
			// for(int i=0;i<100;i++ ){
				// IO.println("from T2 -" + i);
			// }
		// });
		// t1.start();
		// t1.join();
		// t2.start();
		// t2.join();
		Thread t = new Thread(() -> {
			System.out.println("Running...");
		});

		t.start();
		t.join();

		System.out.println("Done");
	 }
}


// class A {
	// private static A a;
	
	// public A returnO() {
		// if(a == null) {
			// return new A();
		// }
		// return a;
	// }
// }
// String s1 = "Java";
// String s2 = "Java";

// System.out.println(s1 == s2);
// System.out.println(s1.equals(s2));

		// List<Integer>list = new ArrayList<>();
		// list.add(10);
		// list.add(20);
		// list.add(30);
		
		// Iterator it = list.iterator();
		
		// while(it.hasNext()) {
			// if(it.next()==10) list.add(10);
		// }
					// IO.println(it.next());
	 // }
	  // HashSet<Employee> set = new HashSet<>();
	 
	// set.add(new Employee(2,"Pravin"));
	// set.add(new Employee(3,"Saurabh"));
	// set.add(new Employee(3,"Saurabh"));
	// set.add(new Employee(3,"Saurabh"));
	// set.add(new Employee(3,"changed"));
	// Employee e1 = new Employee(1, "A");
	// Employee e2 = new Employee(1, "B");

	// set.add(e1);
	// set.add(e2);
	
	// IO.println(set); 
// }
// }



// class Employee {
	
    // int id;
    // String name;
	
	// Employee(int id,String name) {
		// this.id = id;
		// this.name = name;
	// }
	// @Override
	// public String toString() {
		// return id + "->" + name;
	// }
	// @Override 
	// public int hashCode() {
		// return id;
	// }
	
	// @Override
	// public boolean equals(Object obj) {
		// Employee e = (Employee) obj;
		// return e.id == this.id;
	// }
// }
