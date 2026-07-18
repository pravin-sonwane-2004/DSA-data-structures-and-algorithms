import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;

public class LinesWordsCharacters {
    void main() throws FileNotFoundException {
      File f = new File("pravin.txt");
      try{
        if(f.createNewFile()) {
          IO.println("File is created");
        }else {
          IO.println("There is issue to create the file");
        }
      }
      catch(Exception e) {
        e.printStackTrace();
      }
      int lineCount = 0;
      try (BufferedReader br = new BufferedReader(new FileReader("pravin.txt"))) {
            // Read line by line until the end of the file
            while (br.readLine() != null) {
                lineCount++;
            }
            System.out.println("Total lines: " + lineCount);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
         try (FileReader br = new FileReader(f)) {
            // Read line by line until the end of the file
            String s = br.readAllAsString(); 
            int c = s.length();
            System.out.println("Total Characters: " + c);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

            try (FileReader br = new FileReader(f)) {
            // Read line by line until the end of the file
        String content = Files.readString(f.toPath()).trim();

          String[] words = content.split("\\s+");
            int wordCount = words.length;
            
            System.out.println("Total Words: " + wordCount);
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
