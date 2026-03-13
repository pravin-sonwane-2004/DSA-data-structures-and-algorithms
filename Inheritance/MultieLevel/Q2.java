// 2) Shape → Rectangle → Cuboid
// Create three classes:
// • Shape
// o displayShape ()
// • Rectangle (inherits Shape)
// o length
// o width
// o area ()
// • Cuboid (inherits Rectangle)
// o height
// o volume ()
// o area ()
// Task: Calculate area and volume.
// Area of Rectangle = length*width
// Volume of Cuboid= length*width*height
// Total surface area of cuboid=2(length* width + width* height + length *height),


class Shape {
    void displayShape() {
        System.out.println("This is a 3D Shape Hierarchy.");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Cuboid extends Rectangle {
    double height;

    void volume() {
        System.out.println("Volume of Cuboid: " + (length * width * height));
    }

    void area() {
        double surfaceArea = 2 * (length * width + width * height + length * height);
        System.out.println("Total Surface Area of Cuboid: " + surfaceArea);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Cuboid myCuboid = new Cuboid();
        
        // Setting dimensions
        myCuboid.length = 10;
        myCuboid.width = 5;
        myCuboid.height = 3;

        // Executing tasks
        myCuboid.displayShape();
        myCuboid.area();   // Calculates surface area
        myCuboid.volume(); // Calculates volume
    }
}
