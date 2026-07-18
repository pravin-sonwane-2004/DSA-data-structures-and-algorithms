import java.io.*;

public class ObjectInput {
    void main() throws Exception {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("otptstr.txt"));
        Student d = (Student) oi.readObject();
        IO.println(d.getName());
        IO.println(d.getEmail());
    }
}
