// 4) Person and Student
// Create a class Person with:
// • name
// • age
// Create a subclass Student that:
// • Adds marks
// • Displays student details and grade.
// Task: Calculate grade based on marks.

import java.util.*;
class Person {
	String name;
	int age;
}
class Student extends Person {
	Scanner sc = new Scanner(System.in);
	int marks [];
	void addMarks() {
		marks = new int[5];
		IO.println("Enter Marks");
		for(int i=0;i<5;i++) {
			marks[i] = sc.nextInt();
		}
	}
	void displayStudentDetialsandGread() {
		IO.println("Enter Name : ");
		name = sc.nextLine();
		IO.println("Enter The Age : ");
		age = sc.nextInt();
		
		addMarks();
		  IO.println("Name ->" + name);
		  IO.println("Age ->" + age);
		  
		  int grade=0;
			for(int i=0;i<5;i++) {
				grade+=marks[i];
			}
			grade = grade /5 ;
			IO.println("This Gread You Have Right Now - > " + grade);
	}
}   
class Q4 {
	void main() {
		 Student s = new Student();
		 s.displayStudentDetialsandGread();
	}
}