package REVISION_EVERYTHING;

class Parent {
    public void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
   @Override
   public void greet() {
    System.out.println("Hello from Child");
}

}

public class MethodOverride {
    static void main(String[] args) {
        Child child = new Child();
        child.greet(); // Output: Hello from Child
    }
}
