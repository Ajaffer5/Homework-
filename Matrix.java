import java.io.*;
import java.util.*;

public class Matrix {

    public static void main(String[] args) throws IOException {
        if (args.length == 2) {
            // Handle file input
            int[][] matrix1 = readMatrixFromFile(args[0]);
            int[][] matrix2 = readMatrixFromFile(args[1]);
            int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
            writeMatrixToFile(resultMatrix, "matrix3.txt");
        } else if (args.length == 1) {
            // Handle integer input
            try {
                int size = Integer.parseInt(args[0]);
                int[][] matrix1 = generateRandomMatrix(size);
                int[][] matrix2 = generateRandomMatrix(size);
                writeMatrixToFile(matrix1, "matrix1.txt");
                writeMatrixToFile(matrix2, "matrix2.txt");
                int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
                writeMatrixToFile(resultMatrix, "matrix3.txt");
            } catch (NumberFormatException e) {
                System.out.println("Input argument is not an integer.");
            }
        } else {
            // Handle interactive input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter two filenames or an integer:");
            if (scanner.hasNextInt()) {
                int size = scanner.nextInt();
                int[][] matrix1 = generateRandomMatrix(size);
                int[][] matrix2 = generateRandomMatrix(size);
                writeMatrixToFile(matrix1, "matrix1.txt");
                writeMatrixToFile(matrix2, "matrix2.txt");
                int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
                writeMatrixToFile(resultMatrix, "matrix3.txt");
            } else if (scanner.hasNext()) {
                String file1 = scanner.next();
                String file2 = scanner.next();
                int[][] matrix1 = readMatrixFromFile(file1);
                int[][] matrix2 = readMatrixFromFile(file2);
                int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
                writeMatrixToFile(resultMatrix, "matrix3.txt");
            }
            scanner.close();
        }
    }

    private static int[][] readMatrixFromFile(String filename) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(filename));
        List<int[]> matrixList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            String[] line = fileScanner.nextLine().trim().split("\\s+");
            int[] row = new int[line.length];
            for (int i = 0; i < line.length; i++) {
                row[i] = Integer.parseInt(line[i]);
            }
            matrixList.add(row);
        }
        fileScanner.close();
        return matrixList.toArray(new int[0][]);
    }

    private static int[][] generateRandomMatrix(int size) {
        Random rand = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(10); // Generate numbers between 0 and 9
            }
        }
        return matrix;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    private static void writeMatrixToFile(int[][] matrix, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int[] row : matrix) {
            for (int val : row) {
                writer.write(val + " ");
            }
            writer.newLine();
        }
        writer.close();
    }
}


