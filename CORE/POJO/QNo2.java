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
import java.util.*;
class Employee {
	private int empId;
	private String name;
	private int salary;
	private int hra;
	private int da;
	public void setDa(int da) {
		this.da = da;
	}
	public int getDa() {
		return da;
	}
	
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
// Calculate the gross salary for each employee (gross = basic + hra + da).
// Find and display the employee with the maximum salary.
// Print the details of employees whose salary is greater than the average 
// salary of all employees.
class Oper {
	Employee emp;
	int calculateGross(Employee emp) {
		return emp.getSalary() + emp.getHra()+emp.getDa();
		
	}
	int averageSal (Employee [] emp) {
		int average = 0;
		int sum =0;
		for(int i=0;i<emp.length;i++) {
			sum += emp[i].getSalary();
		}
		average = sum/5;
		return average;
	}
	void PrintEmpSalIsGrater(Employee [] emp, int average) {
		for(int i=0;i<emp.length;i++) {
			if(emp[i].getSalary() > average) {
				IO.println();
				IO.println("Emp Name Is "+emp[i].getName() + " Having Salary more than average = > "+ emp[i].getSalary());
			}
		}
	}
}

class Operation {
	public static void main(String [] args) {
		Employee [] emp = new Employee[5];
		
		for(int i=0;i<emp.length;i++) {
			emp[i] = new Employee();
		}   
		
		emp[0].setEmpId(29);
		emp[0].setName("Pravin S ");
		emp[0].setSalary(20220212);
		emp[0].setHra(32);
		emp[0].setDa(2);
		
		emp[1].setEmpId(30);
		emp[1].setName("Pravin");
		emp[1].setSalary(1212);
		emp[1].setHra(32);
		emp[1].setDa(2);
				
		emp[2].setEmpId(31);
		emp[2].setName("visshal");
		emp[2].setSalary(1244412);
		emp[2].setHra(32);
		emp[2].setDa(2);
		
		emp[3].setEmpId(32);
		emp[3].setName("Pravin");
		emp[3].setSalary(1212);
		emp[3].setHra(32);
		emp[3].setDa(2);

		
		emp[4].setEmpId(33);
		emp[4].setName("sk");
		emp[4].setSalary(32222);
		emp[4].setHra(32);
		emp[4].setDa(2);
			
		for(int i=0;i<emp.length;i++) {
			IO.println(emp[i].getEmpId()+ " "+ emp[i].getName() + " " + emp[i].getSalary() + " " + emp[i].getHra() + " " + emp[i].getDa());
		}
		IO.println();
			Oper o = new Oper();
			
			for(int i = 0; i < emp.length; i++) {
				int gross = o.calculateGross(emp[i]);
				IO.println(emp[i].getName() + " -> " + gross);
			}
			
			IO.println("Average sal " + o.averageSal(emp));
			o.PrintEmpSalIsGrater(emp , o.averageSal(emp));
		
	}
}