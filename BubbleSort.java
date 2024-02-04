import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class BubbleSort {

    public static int[] createRandomArray(int arrayLength) {
        int[] array = new int[arrayLength];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101); // Random number between 0 and 100
        }
        return array;
    }

    public static void writeArrayToFile(int[] array, String filename) {
        try (PrintWriter out = new PrintWriter(filename)) {
            for (int number : array) {
                out.println(number);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    public static int[] readFileToArray(String filename) {
        File file = new File(filename);
        try (Scanner scanner = new Scanner(file)) {
            int[] array = new int[(int) file.length()];
            int i = 0;
            while (scanner.hasNextInt()) {
                if (i < array.length) {
                    array[i++] = scanner.nextInt();
                } else {
                    break;
                }
            }
            return array;
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return new int[0]; // return an empty array
        }
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    // swap
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to create a random array and store it in a file.");
        System.out.println("Enter 2 to read an array from a file, sort it, and store it in another file.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the length of the array:");
                int length = scanner.nextInt();
                int[] randomArray = createRandomArray(length);
                System.out.println("Enter the filename to store the array:");
                scanner.nextLine(); // consume the rest of the line
                String filename = scanner.nextLine();
                writeArrayToFile(randomArray, filename);
                break;
            case 2:
                System.out.println("Enter the filename to read the array from:");
                scanner.nextLine(); // consume the rest of the line
                String inputFilename = scanner.nextLine();
                int[] arrayFromFile = readFileToArray(inputFilename);
                bubbleSort(arrayFromFile);
                System.out.println("Enter the filename to store the sorted array:");
                String outputFilename = scanner.nextLine();
                writeArrayToFile(arrayFromFile, outputFilename);
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
        scanner.close();
    }
}

