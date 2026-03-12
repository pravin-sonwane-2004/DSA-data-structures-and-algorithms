// 3) Shape and Rectangle
// Create a class Shape with:
// • Method displayShape()
// Create a subclass Rectangle that:
// • Takes length and width
// • Calculates area
// Task: Print shape name and area.

class Shape {

    void displayShape() {
        System.out.println("Shape: Rectangle");
    }

}

class Rectangle extends Shape {

    int length;
    int width;

    int calculateArea() {
        return length * width;
    }

}

public class Q3 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.length = 10;
        r.width = 5;

        r.displayShape();  // parent method

        int area = r.calculateArea();

        System.out.println("Area: " + area);
    }

}