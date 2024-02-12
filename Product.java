// File: src/products/Product.java
package products;

public class Product {
    protected String name;
    protected double price;

    // Constructor that initializes a product with a name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to print product details
    public void printDetails() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }

    // Getters and setters for the name and price fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
