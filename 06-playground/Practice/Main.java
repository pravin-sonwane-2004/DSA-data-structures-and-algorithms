
// class Student {
	// int id;
	// String name;
	// Department dept;
	// Student(int id,String name,Department dept) {
		// this.id = id;
		// this.name = name;
		// this.dept = dept;
	// }
	// @Override 
	// public String toString() {
		// return this.id + "->" + this.name + "->" + dept.dept;
	// }
// }
// class Department {
	// String dept;
	// Department(String dept) {
		// this.dept = dept;
	// }
// }

// public class Main {
    // void main() {
		// Department d = new Department("CSE");
		// Student s = new Student(1,"Pravin",d);
		// IO.println(s.toString());
    // }
// }


// class Engine {
	// Engine() {
		// IO.println("Engine called");
	// }
	// void start() {
		// IO.println("Started...");
	// }
// }
// class Car {
	 // private final Engine engine = new Engine();
	 // String carname;
	 // Car(String carname) {
		 // this.carname = carname;
		 // engine.start();
	 // }
// }

// public class Main {
    // void main() {
		// Car c = new Car("Lemo"); 
	// }
// }

// class Address {
	// String adr;
	// Address(String adr) {
		// this.adr = adr;
	// }
// }
	// class Student {
		// int id;
		// String name;
		// Address address;
		// Student(int id,String name,String address) {
			// this.id = id;
			// this.name = name;
			// this.address = address;
		// }
		// Student(Student s1) {
			// this.id = s1.id;
			// this.name = s1.name ;
			// adr = address.adr;
		// }
		// @Override 
		// public String toString() {
			// return this.id + "->" + this.name;
		// }
	// }

	// public class Main {
		// void main() {
			// Student s  = new Student(1,"Pravin");
			// Student s1 = new Student(s);
			// IO.println("S1=>"+s1);
			// IO.println("S=>"+s);
			
		// }
	// }
	
	class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

// class Student {
    // int id;
    // String name;
    // Address address;

    // Student(int id, String name, Address address) {
        // this.id = id;
        // this.name = name;
        // this.address = address;
    // }

    Deep Copy Constructor
    // Student(Student s) {
        // this.id = s.id;
        // this.name = s.name;
        // this.address = new Address(s.address.city);
    // }

    // @Override
    // public String toString() {
        // return id + " -> " + name + " -> " + address.city;
    // }
// }

// public class Main {
    // public static void main(String[] args) {

        // Address a = new Address("Pune");

        // Student s1 = new Student(1, "Pravin", a);
        // Student s2 = new Student(s1);

        // s2.address.city = "Mumbai";

        // System.out.println(s1);
        // System.out.println(s2);
    // }
// }