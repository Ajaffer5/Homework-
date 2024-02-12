// File: src/users/AbstractUser.java
package users;

import base.AbstractEntity;

public abstract class AbstractUser extends AbstractEntity {
    protected String username;
    protected String password;

    // Constructor that initializes an AbstractUser with an ID, username, and password
    public AbstractUser(long id, String username, String password) {
        super(id);
        this.username = username;
        this.password = password;
    }

    // Abstract method that should be implemented by subclasses to print user details
    @Override
    public abstract void printDetails();

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
