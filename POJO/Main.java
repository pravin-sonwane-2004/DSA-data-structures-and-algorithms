// Q2.Create a POJO class Student with:
// rollNo (int)
// name (String)
// marks (int)

// Calculate grade:
// Marks ≥ 75 → Grade A
// Marks 60–74 → Grade B
// Marks 50–59 → Grade C
// Below 50 → Fail

// Display student details with grade.
// Explanation:
// Access marks using getter.
// Apply grading logic in main method.

// Input:
// Enter Roll No: 1
// Enter Name: Sneha
// Enter Marks: 68

// Output:
// Roll No: 1
// Name: Sneha
// Marks: 68
// Grade: B

import java.util.Scanner;
class Student {
	private int rollNo;
	private String name;
	private int marks;
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setName(String name) {
		this.name  = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getMarks() {
		return marks;
	}
}
class Calculate {
	public String whatGread(int marks) {
		 if(marks >= 101) {
			 return "invalid";
		 }
		 if(marks < 50){
			 return "Failed";
		 }
		 else if (marks >= 50 && marks < 75) {
			 
		 }
		  else if(marks <60 && marks >= 75) {
			 return "b";
		 }
		  else if(marks > 75 && marks <101) {
			 return "a";
		 }
		 
		 return "Enter Valid Data";
	}
}
class Main {
	void main() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		Calculate c = new Calculate();
		
		IO.println("Enter Roll No");
		student.setRollNo(sc.nextInt());

        sc.nextLine();  

		IO.println("Enter Name : ");
		student.setName(sc.nextLine());
		
		IO.println("Enter Marks : ");
		student.setMarks(sc.nextInt());
		IO.println("________________________________");
		IO.println("Name is : " + student.getName());
		IO.println("Roll No is " + student.getRollNo());
		IO.println("Marks are " + student.getMarks());
		IO.println("Gread is " + c.whatGread(student.getMarks()));
		
	}
}