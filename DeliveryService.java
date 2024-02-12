// File: src/services/DeliveryService.java
package services;

public class DeliveryService extends Service {
    private String deliveryArea; // The area where the service operates

    // Constructor that initializes a delivery service with name, cost, and delivery area
    public DeliveryService(String serviceName, double serviceCost, String deliveryArea) {
        super(serviceName, serviceCost); // Call the superclass constructor to set the name and cost
        this.deliveryArea = deliveryArea;
    }

    // Override the printDetails method to include delivery service-specific details
    @Override
    public void printDetails() {
        super.printDetails(); // Call the superclass method to print name and cost
        System.out.println("Delivery Area: " + deliveryArea);
    }

    // Getter and setter for the deliveryArea field
    public String getDeliveryArea() {
        return deliveryArea;
    }

    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea;
    }
}

