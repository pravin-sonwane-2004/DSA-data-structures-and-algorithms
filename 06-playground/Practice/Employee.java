// class Student implements Cloneable {
    // String name;

    // Student(Student s2) {
        // this.name = s2.name;
    // }

    // Student(String name) {
        // this.name = name;
    // }
// }
import java.io.*;

class IMClass implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    transient String pass;

    IMClass(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }
}

public class Employee {

    public static void main(String[] args) throws Exception {

        ObjectOutputStream os =
                new ObjectOutputStream(
                        new FileOutputStream("Pravin.txt"));

        IMClass obj = new IMClass("Pravin", "12345");

        os.writeObject(obj);

        os.close();

        System.out.println("Object Written Successfully");
    }
}