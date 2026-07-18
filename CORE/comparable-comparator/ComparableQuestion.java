import java.util.*;
import java.io.*;
class ComparableQuestion {
	void main() throws Exception {
		 List<Student> list = new ArrayList<>();
		 list.add(new Student(7,"Pravin",2222));
		 list.add(new Student(6,"Pra",2222));
		 list.add(new Student(15,"Prin",2222));
		 list.add(new Student(4,"Pravin",2222));
		 list.add(new Student(2,"avin",2222));
		 list.add(new Student(1,"Pran",2222));
		 
		// No lambda arrow. This creates a quick, one-time class implementation.
			Comparator<Student> c = new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return Integer.compare(s1.id, s2.id);
				}
			};

		 IO.println(list.toString());
		 
		 Collections.sort(list,c);
		 IO.println(list.toString());
	}
}	

class Student{
	int id;
	String name;
	int salary;
	
	Student(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	// @Override
	// public int compareTo(Student other) {
		 // return Integer.compare(other.id,this.id);
	// }
	    @Override
    public String toString() {
        return "(" + this.id + "->" + this.name + "->" + this.salary + ")";
    }

}