// Store N products.
 // Apply discount:
// 20% if price > 5000
// 10% if price ≤ 5000
// Display final price after discount.

// Explanation:
// Store product details in array.
// Use loop to calculate discount.
// Update price.
// Print updated details.
 // Input:
// Enter number of products: 3

// 1
// Laptop
// 60000

// 2
// Shoes
// 4000

// 3
// Watch
// 7000
// Output:
// Final Product Details:

// 1 Laptop 48000.0
// 2 Shoes 3600.0
// 3 Watch 5600.0
import java.util.Scanner;

class QNo10 {
	Scanner sc = new Scanner (System.in);
	 void main() {
		IO.println("Enter Size Of Product : ");
		
		Product[] prod = new Product[size];
		
		IO.println("Enter Details of products : " + initializeProduct(prod)); 
	 }
	 
}

public class Product {
    int id;
    String name;
    int price;

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(int price) {
        this.price = price;
    }
}
