package StringsQ;

public class StringsAreImmutible {
    void main() {
        //this is not override, this is pointing to another referance
        // String s = "Pravin";
        // s = "Sonwane";
        // System.out.println(s);


        //but in actual 
        //by this example we can understand that strings are not mutible we cant change them
        String a = "Pravin";
        String b = a;
        a = "Sonwane";
        System.out.println(b);

    }

}
