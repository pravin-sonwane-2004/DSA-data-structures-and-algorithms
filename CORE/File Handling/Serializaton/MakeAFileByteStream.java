import java.io.*;
import java.util.*;
public class MakeAFileByteStream {
	void main() throws Exception{
	File f = new File("serial.txt");
	f.createNewFile();
	    ObjectOutputStream or = new ObjectOutputStream(new FileOutputStream("serial.txt"));
        Student s = new Student(1, "Pravin", 32323);
        or.writeObject(s); // Use writeObject() to save
        or.close();        // Close the stream to flush data to the disk
        
        // 3. Read the object back from the file
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("serial.txt"));
        Student ss = (Student) oi.readObject(); // Use oi.readObject() with no arguments
        oi.close();                             
	}
}

class Student implements Serializable{
    private int id;
    private String name;
    private int balance;

    // 1. Default Constructor
    public Student() {
    }

    // 2. Parameterized Constructor
    public Student(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
