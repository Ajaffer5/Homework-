// Include the package statement if Main.java is in a package
// package mypackage;

// Import statements for user classes if they are in a different package
import users.AdminUser;
import users.GeneralUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Assuming AdminUser and GeneralUser constructors and methods are correctly defined
        AdminUser admin = new AdminUser(1, "adminUsername", "adminPassword");
        admin.printDetails();
        // This call assumes manageSystemSettings is a method in AdminUser
        admin.manageSystemSettings();

        GeneralUser generalUser = new GeneralUser(2, "userUsername", "userPassword");
        generalUser.printDetails();
        // This call assumes browseCatalog is a method in GeneralUser
        generalUser.browseCatalog();

        // Additional code to test other functionalities
    }
}
