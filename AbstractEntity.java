// File: src/base/AbstractEntity.java
package base;

public abstract class AbstractEntity {
    protected long id;

    // First constructor, which allows for specifying the ID
    public AbstractEntity(long id) {
        this.id = id;
    }

    // Second constructor, which generates a unique ID
    public AbstractEntity() {
        this.id = generateId();
    }

    // Abstract method that subclasses must implement to print their details
    public abstract void printDetails();

    // Static method that generates a unique ID
    // For this example, we are using the current time in milliseconds
    // In a real application, you'd likely want to use a more robust method
    private static long generateId() {
        return System.currentTimeMillis() / 1000;
    }

    // Final method to get the ID value
    // Marked as final to prevent overriding
    public final long getId() {
        return id;
    }
}
