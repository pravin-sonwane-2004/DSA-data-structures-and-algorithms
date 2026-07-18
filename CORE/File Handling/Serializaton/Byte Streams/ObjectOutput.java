import java.io.*;

public class ObjectOutput {
    void main() throws Exception{
        File f = new File("otptstr.txt");

        Student s = new Student(
            101,
            "Pravin",
            "pravin@gmail.com"
        );
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream("otptstr.txt");
        ObjectOutputStream obs = new ObjectOutputStream(fos);
        for(int i=0;i<10;i++) {
                    obs.writeObject(s);
        }
        obs.close();
        IO.println("Writing is completed");
    }
}
