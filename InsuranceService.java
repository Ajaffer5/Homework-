// File: src/services/InsuranceService.java
package services;

public class InsuranceService extends Service {
    private String policyNumber; // Unique identifier for the insurance policy
    private String insuranceType; // Type of insurance, e.g., "Health", "Car", "Home"

    // Constructor that initializes an insurance service with name, cost, policy number, and type
    public InsuranceService(String serviceName, double serviceCost, String policyNumber, String insuranceType) {
        super(serviceName, serviceCost); // Call the superclass constructor to set the name and cost
        this.policyNumber = policyNumber;
        this.insuranceType = insuranceType;
    }

    // Override the printDetails method to include insurance service-specific details
    @Override
    public void printDetails() {
        super.printDetails(); // Call the superclass method to print name and cost
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Insurance Type: " + insuranceType);
    }

    // Getters and setters for the policyNumber and insuranceType fields
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }
}
