// 2) Vehicle and Car
// Create a class Vehicle with:
        // • brand
        // • speed
        // Create a subclass Car that:
        // • Adds model
        // • Displays full vehicle details.
        // Task: Call parent class method using inheritance.
class Vehicle {
    String brand;
    int speed;

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    String model;

    void displayCarDetails() {
        displayVehicle();   // calling parent method
        System.out.println("Model: " + model);
    }
}

public class Q2 {
    public static void main(String[] args) {

        Car c = new Car();
        c.brand = "Toyota";
        c.speed = 180;
        c.model = "Fortuner";

        c.displayCarDetails();
    }
}