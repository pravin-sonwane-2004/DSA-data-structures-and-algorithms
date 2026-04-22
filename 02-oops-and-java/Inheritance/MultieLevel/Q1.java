// 1) Person → Employee → Manager
// Create three classes:
// • Person
// o name
// o age
// o displayPerson()
// • Employee (inherits Person)
// o empId
// o salary
// o displayEmployee()
// • Manager (inherits Employee)
// o department
// o bonus
// o displayManager()
// Task: Create an object of Manager and display all details using inherited methods.

class Person {
	String name;
	int age;
	
	void displayPerson () {
		IO.println("\nName = " + name + "\nage = " +age);
	}
}
class Employee extends Person {
	int empId;
	int salary;
	void displayEmployee() {
		displayPerson();
		IO.println("\nEmployee ID = " + empId + " \nsalary = " + salary);
	}
}
class Manager extends Employee {
	  String department;
	  int bonus;
	  void displayManager() {
		   displayEmployee();
		   int finalSalary = bonus + salary;
		   IO.println("Bonus is = " +bonus);
		  IO.println("\n Department = " + department + "\nFinal Salary = " + finalSalary);
	  }
}
class Q1 {
	  void main() {
		   Manager mg = new Manager();
			mg.name = "Pravin";
			mg.age = 23;
			mg.salary = 10102012;
			mg.empId = 212;
			mg.department = "IT";
			mg.bonus = 2122112;
			mg.displayManager();
	  }
}