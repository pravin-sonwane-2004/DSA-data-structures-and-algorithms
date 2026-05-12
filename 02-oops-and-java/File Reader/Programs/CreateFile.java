import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedWriter; 
class CreateFile {
	void main() throws Exception {
        File file = new File("D:\\Giris Tech Hub Collection\\DSA\\02-oops-and-java\\File Reader\\Created Files\\test.txt");	 
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }                             
		String p = "ccncc, this is a test."; 			
		BufferedWriter fr = new BufferedWriter(new FileWriter(file));
		
        fr.write(p);
        fr.close();
	}
}