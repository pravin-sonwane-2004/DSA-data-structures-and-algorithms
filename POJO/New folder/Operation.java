// Q2. Problem:
// Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. 
// Store details
// of 5 employees using an array of objects. Perform the following operations:
// Calculate the gross salary for each employee (gross = basic + hra + da).
// Find and display the employee with the maximum salary.
// Print the details of employees whose salary is greater than the average 
// salary of all employees.
// Explanation:
// This covers aggregation + comparison + filtering.
// You’ll work with numerical calculations and finding max/average values.

class Employee {
	private int empId;
	private String name;
	private int salary;
	private int hra;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		 this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getHra () {
		return hra;
	}
}

class Operation {
	public static void main(String [] args) {
		Employee [] emp = new Employee[5];
		emp[0] = new Employee();
		emp[0].setSalary(1212);
		emp[0].setEmpId(32);
		emp[0].setHra(32);
		emp[0].setName("Pravin");
		
		for(int i=0;i<emp.length;i++) {
			IO.println(emp[i].getEmpId() + " ");
		}
		
		
	}
}