import java.io.*;
public class output {
    void main() throws Exception {
		  // Student sq = new Student(1,"pravin");
		  // FileOutputStream fos = new FileOutputStream("Pravin.txt");
		  // ObjectOutputStream obs = new ObjectOutputStream(fos);
		  // obs.writeObject(sq);
		  // obs.close();
		  // fos.close();
		  
		  FileInputStream fos = new FileInputStream("Pravin.txt");
		  ObjectInputStream obs = new ObjectInputStream(fos);
		  Student s2 = (Student) obs.readObject();
		  IO.println(s2.getName());
		  obs.close();
    }
}

class Student implements Serializable{
	int id;
	String name;
	Student(int id,String name) {
		this.id= id;
		this.name = name;
	}
	int getId() {
		return this.id;
	}
	String getName() {
		return this.name;
	}
}
