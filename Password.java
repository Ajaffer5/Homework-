import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8 || password.length() > 16) {
            return false; // Check for password length
        }

        int categoryCount = 0;

        // Pattern for lowercase letters
        Pattern lowercase = Pattern.compile("[a-z]");
        // Pattern for uppercase letters
        Pattern uppercase = Pattern.compile("[A-Z]");
        // Pattern for numbers
        Pattern numbers = Pattern.compile("[0-9]");
        // Pattern for special characters
        Pattern special = Pattern.compile("[~!@#$%^&*()=_+\\-]");

        // Check for lowercase letters
        if (lowercase.matcher(password).find()) {
            categoryCount++;
        }

        // Check for uppercase letters
        if (uppercase.matcher(password).find()) {
            categoryCount++;
        }

        // Check for numbers
        if (numbers.matcher(password).find()) {
            categoryCount++;
        }

        // Check for special characters
        if (special.matcher(password).find()) {
            categoryCount++;
        }

        // The password is valid if at least three of the categories are matched
        return categoryCount >= 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password to validate:");
        String inputPassword = scanner.nextLine();
        
        if (isValidPassword(inputPassword)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid.");
        }
        
        scanner.close();
    }
}


