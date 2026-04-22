package TarnaryOperators;
/*
Q50. Given a number, print Perfect Square if its square root is an integer,
 otherwise Not Perfect Square — using ternary operators.

 */
public class CheckPerfectSquareOrNot {
    public static void main (String [] args ){
        double num = 20;
        double root  = Math.sqrt(num);
        String res = (root == (int) root)
                ? "perfect"
                : "not perfect";
        System.out.println(res);
    }
}
