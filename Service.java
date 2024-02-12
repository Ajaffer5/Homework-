// File: src/services/Service.java
package services;

public class Service {
    protected String serviceName;
    protected double serviceCost;

    // Constructor that initializes a service with a name and cost
    public Service(String serviceName, double serviceCost) {
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    // Method to print service details
    public void printDetails() {
        System.out.println("Service: " + serviceName + ", Cost: $" + serviceCost);
    }

    // Getters and setters for the serviceName and serviceCost fields
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }
}
