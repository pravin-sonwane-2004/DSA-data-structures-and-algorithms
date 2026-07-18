import java.util.*;

public class Q1 {
    void main() {
        ArrayList<Products> p = new ArrayList<>();

        p.add(new Products(20000, 5, "Saurabh"));
        p.add(new Products(10000, 8, "Pravin"));
        p.add(new Products(10000, 7, "Pravin"));
        p.add(new Products(1000000, 5, "SK"));
        p.add(new Products(1004400, 3, "PraviPKn"));

        System.out.println("Original List:");
        System.out.println(p + "\n");

        // 🔹 Sort by ID
        Collections.sort(p, new CompareById());
        System.out.println("Sorted by ID:");
        System.out.println(p + "\n");

        // 🔹 Sort by Price
        Collections.sort(p, new CompareBySalary()); // or CompareByPrice
        System.out.println("Sorted by Price:");
        System.out.println(p + "\n");

        // 🔹 Sort by Name (Anonymous class)
        Collections.sort(p, new Comparator<Products>() {
            public int compare(Products p1, Products p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("Sorted by Name:");
        System.out.println(p);
    }
}