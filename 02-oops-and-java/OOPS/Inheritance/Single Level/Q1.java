// 1) Employee Salary Calculation
// Create a class Employee with:
  // • name
  // • basicSalary
// Create a subclass Manager that:
    // • Adds bonus
    // • Calculates total salary
    // Task: Write a program to display employee name and total salary.

class Employee {
	 String name;
	 int salary;
}
class Manager extends Employee {
	double bonus;
	double calculateSalary()  {
		return salary + bonus;
	}
}

class Q1 {
	void main() {
		Manager m = new Manager();
		m.name = "pravin";
		m.salary = 10000;
		m.bonus = 1000;
		
        System.out.println("Employee Name: " + m.name);
        System.out.println("Total Salary: " + m.salary);
		
		IO.println(m.calculateSalary());
	}
}              