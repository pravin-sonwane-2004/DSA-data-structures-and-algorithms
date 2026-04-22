package TarnaryOperators;
/*
Q32. Write a Java program to accept 3 angles of triangle
 and check whether a triangle is valid or not.
 */

public class ValidTriangle {
    public static void main(String [] args) {
        int a= 60;
        int b = 60;
        int c = 90;
        String res = a>0 && b>0 && c>0 && a+b+c == 180? "valid" : "invalid";
        System.out.println(res);
    }
}
