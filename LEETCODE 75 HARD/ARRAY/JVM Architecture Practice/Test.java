import java.lang.reflect.*;
class Student {
       public String getName () {
            return null;
        }
    public int getMarks() {
        return 10;
    }
}

public class Test {
   public static void main(String [] args)  {

                                                                    //after loding area  those classes are get into the method area then this goes into the heap area 
    Student s1 = new Student();    // Student s1 = new Student();  // these two objects point to sigle class class object which is in heap area 
    Class c1 = s1.getClass();
    Class c2 = s1.getClass();
    Student s2 = new Student();    // Student s2 = new Student();    
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1==c2);



    // //this is how can we can we get method
    // //we can get How Many Classes are there int the main method
    //    int count  =0;
    //    Class c = Class.forName("Student");
    //    Method[]m = c.getDeclaredMethods();
    //    for(Method m1 : m) {
    //     count++;
    //     System.out.println(m1.getName());
    //    }
    //    System.out.println(count);
   } 
}
