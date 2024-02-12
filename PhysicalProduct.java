// File: src/products/PhysicalProduct.java
package products;

public class PhysicalProduct extends Product {
    // Additional attributes specific to physical products
    private double weight;
    private String dimensions; // Example: "10x20x30 cm"

    // Constructor that initializes a physical product with name, price, weight, and dimensions
    public PhysicalProduct(String name, double price, double weight, String dimensions) {
        super(name, price); // Call the superclass constructor to set name and price
        this.weight = weight;
        this.dimensions = dimensions;
    }

    // Override the printDetails method to include physical product-specific details
    @Override
    public void printDetails() {
        super.printDetails(); // Call the superclass method to print name and price
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Dimensions: " + dimensions);
    }

    // Getters and setters for the additional fields
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
