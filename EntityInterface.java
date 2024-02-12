// File: base/EntityInterface.java
package base;

public interface EntityInterface {
    // Constant declaration
    long MIN_ID_VALUE = 1;

    // Abstract methods
    void save();
    void delete();
}