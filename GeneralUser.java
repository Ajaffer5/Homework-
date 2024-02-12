// File: src/users/GeneralUser.java
package users;

public class GeneralUser extends AbstractUser {

    // GeneralUser constructor
    public GeneralUser(long id, String username, String password) {
        super(id, username, password);
    }

    // Implement the abstract method to print user details
    @Override
    public void printDetails() {
        System.out.println("General User: " + username + " with ID: " + getId());
    }

    // General user-specific methods can be added here
    public void browseCatalog() {
        // Logic for browsing a product catalog
    }
}
