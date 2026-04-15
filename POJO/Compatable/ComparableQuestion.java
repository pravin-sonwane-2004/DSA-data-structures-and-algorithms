import java.util.*;

class Product implements Comparable<Product> {
    int price;
    int rating;
    String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(int price, int rating, String name) {
        this.price = price;
        this.rating = rating;
        this.name = name;
    }
		// @Override
		// public int compareTo(Product other) {
			// return Integer.compare(this.getPrice(),other.getPrice());
		// }
		
		// @Override
		// public int compareTo(Product other) {
			// return this.getName().compareTo(other.getName());
		// }
	}
class ComparableQuestion {
    void main() {
        List<Product> list = new ArrayList<>();

        list.add(new Product(500, 4, "A"));
        list.add(new Product(200, 5, "B"));
        list.add(new Product(900, 3, "C"));
        list.add(new Product(100, 2, "D"));
        list.add(new Product(700, 1, "E"));
		list.add(new Product(800,7,"F"));
        Collections.sort(list);

        for (Product d : list) {
            IO.println(d.getName() + " -> " + d.getPrice() + " - " + d.getRating());
        }
    }
}