public class OverloadMainExample {
    // 1. Standard entry point for the JVM
    public static void main(String[] args) {
        System.out.println("Standard main(String[] args) executed.");
        
        // Calling overloaded versions manually
        main(10);
        main("Hello Java");
    }

    // 2. Overloaded version with an int parameter
    public static void main(int number) {
        System.out.println("Overloaded main(int) executed with: " + number);
    }

    // 3. Overloaded version with a String parameter
    public static void main(String message) {
        System.out.println("Overloaded main(String) executed with: " + message);
    }
}
