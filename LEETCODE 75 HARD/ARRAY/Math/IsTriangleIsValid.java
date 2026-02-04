package Math;

public class IsTriangleIsValid {
    public static void main(String [] args) {
            int a = 5;
            int b = 6;
            int c = 4;
            if(a+b>c && a+c>b && b+c>a) {
                System.out.println("True");
            }
            else {
                System.out.println("false");
            }
    }

}
