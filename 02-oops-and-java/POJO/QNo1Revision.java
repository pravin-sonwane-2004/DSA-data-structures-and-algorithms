// Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
// Calculate the total marks of each student.
// Find the student with the highest average marks.
// Display the list of students who have failed in any subject (marks < 35).
import java.util.*;
class Student {
	private int rollNo;
	private String name;
	private int [] marks;
	
	// Student(int rollNo , String name,int marks []) {
		// this.rollNo = rollNo;
		// this.name = name;
		// this.marks = marks;
	// }
	
	public void setrollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int []  getMarks() {
		return marks;
	}
	public void setMarks(int [] marks) {
		 this.marks = marks;
	}
}
class QNo1Revision {
	Scanner sc = new Scanner(System.in);
	void main() {
		Student [] st = new Student[3];
		IO.println("Enter");
		for(int i=0;i<st.length;i++) {
			IO.println("Enter 3 Std Detials");
			st[i] = new Student();
			IO.println("Enter The Name");
			String s = sc.nextLine();
			st[i].setName(s);
			IO.println("Enter The rollNo");
			int n = sc.nextInt();
			st[i].setrollNo(n);
			IO.println("Enter The 3 Sub Marks");
			int [] m = new int[3];
			
			for(int j=0;j<m.length;j++) {
				m[j] = sc.nextInt();
			}
			st[i].setMarks(m);
			sc.nextLine();
			
		}
		for(int i =0;i<st.length;i++) {
			IO.println(st[i].getName() + " " + st[i].getRollNo()+  " "+ Arrays.toString(st[i].getMarks()));
		}
	}
}