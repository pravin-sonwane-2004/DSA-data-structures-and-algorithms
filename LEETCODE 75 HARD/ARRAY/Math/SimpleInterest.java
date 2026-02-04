package Math;

public class SimpleInterest {
    public static void main(String[] args) {

        double principal = 122;
        double rate = 12;
        double time = 1;

        double si = (principal * rate * time) / 100;
        System.out.println(si);
    }
}
