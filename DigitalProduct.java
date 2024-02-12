// File: src/products/DigitalProduct.java
package products;

public class DigitalProduct extends Product {
    // Additional properties specific to digital products
    private String downloadUrl;

    // Constructor that initializes a digital product with name, price, and download URL
    public DigitalProduct(String name, double price, String downloadUrl) {
        super(name, price); // Call the superclass constructor to set name and price
        this.downloadUrl = downloadUrl;
    }

    // Override the printDetails method to include digital product-specific details
    @Override
    public void printDetails() {
        super.printDetails(); // Call the superclass method to print name and price
        System.out.println("Download URL: " + downloadUrl);
    }

    // Getter and setter for the downloadUrl field
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}


