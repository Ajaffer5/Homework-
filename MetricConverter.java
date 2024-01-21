import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Metric Converter!");

        while (true) {
            System.out.println("\nMetric Converter Options:");
            System.out.println("1. Length (Kilometers <-> Miles)");
            System.out.println("2. Weight (Kilograms <-> Pounds)");
            System.out.println("3. Temperature (Celsius <-> Fahrenheit)");
            System.out.println("4. Volume (Liters <-> Gallons)");
            System.out.println("Type 'Exit' or '-1' to exit the program.");
            System.out.print("Please input your query (1-4) or exit: ");

            String input = scanner.next();

            // Check for exit condition
            if (input.equalsIgnoreCase("Exit") || input.equals("-1")) {
                break;
            }

            // Validate if the input is a number
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1-4, 'Exit', or '-1'.");
                continue;
            }

            System.out.print("Enter the value to convert: ");
            // Ensure the input is a double
            double value;
            try {
                value = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();  // Clear the buffer
                continue;
            }

            switch (choice) {
                case 1:
                    lengthConversion(value);
                    break;
                case 2:
                    weightConversion(value);
                    break;
                case 3:
                    temperatureConversion(value);
                    break;
                case 4:
                    volumeConversion(value);
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1-4, 'Exit', or '-1'.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the Metric Converter.");
    }

    private static void lengthConversion(double kilometers) {
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is " + miles + " miles.");
        double kilometersBack = miles / 0.621371;
        System.out.println(miles + " miles is " + kilometersBack + " kilometers.");
    }

    private static void weightConversion(double kilograms) {
        double pounds = kilograms * 2.20462;
        System.out.println(kilograms + " kilograms is " + pounds + " pounds.");
        double kilogramsBack = pounds / 2.20462;
        System.out.println(pounds + " pounds is " + kilogramsBack + " kilograms.");
    }

    private static void temperatureConversion(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
        double celsiusBack = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " Fahrenheit is " + celsiusBack + " Celsius.");
    }

    private static void volumeConversion(double liters) {
        double gallons = liters * 0.264172;
        System.out.println(liters + " liters is " + gallons + " gallons.");
        double litersBack = gallons / 0.264172;
        System.out.println(gallons + " gallons is " + litersBack + " liters.");
    }
}