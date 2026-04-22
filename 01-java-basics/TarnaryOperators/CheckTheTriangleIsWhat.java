package TarnaryOperators;
/*
Q33. Write a Java program to check whether a triangle
is equilateral , isoscale or scalene.
 */

public class CheckTheTriangleIsWhat {
    public static void main(String[] args) {
        int a =6;
        int b= 5;
        int c=8;
        boolean isValid = (a+b>c) && (a+c>b) && (b+c>a);
        boolean isEquilatral = isValid && a==b && b==c;
        boolean isIsoscale =  isValid && !isEquilatral &&  (a==b || a==c || b==c);
        boolean isScalen = isValid && (a!=b && a!=c && b!=c);
        System.out.println(" equlatrial : "+isEquilatral + " ,isoscale : " + isIsoscale + " ,scalene : "+ isScalen );
    }
}