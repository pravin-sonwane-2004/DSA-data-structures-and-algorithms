class Person {
    private final String name;
    private final int age;

    // Constructor to initialize fields
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    // No setter methods, making it immutable
}

public class ImmutableExample {
    static void main(String[] args) {
        Person person = new Person("Alice", 30);
        
        // person.setName("Bob"); // Error: setName method does not exist

        System.out.println(person.name()); // Output: Alice
        System.out.println(person.age());  // Output: 30
    }
}
