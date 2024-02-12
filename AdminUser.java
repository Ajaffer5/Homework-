// File: src/users/AdminUser.java
package users;

public class AdminUser extends AbstractUser {

    // AdminUser constructor
    public AdminUser(long id, String username, String password) {
        super(id, username, password);
    }

    // Implement the abstract method to print user details
    @Override
    public void printDetails() {
        System.out.println("Admin User: " + username + " with ID: " + getId());
    }

    // Admin-specific methods can be added here
    public void manageSystemSettings() {
        // Logic for managing system settings
    }
}
