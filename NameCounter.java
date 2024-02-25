import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class NameCounter {

    private static final String[] RANDOM_NAMES = {
        "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hugo",
        "Ivy", "Jack", "Katie", "Louis", "Mona", "Nate", "Olivia", "Pete",
        "Quincy", "Rachel", "Steve", "Tina", "Uma", "Victor", "Wendy", "Xavier",
        "Yvonne", "Zack"
    };

    public static void main(String[] args) {
        // Create names.txt with random names
        createRandomNamesFile("names.txt", 10); // 10 random names

        // Count the occurrences of each name in names.txt
        Map<String, Integer> nameCounts = countNamesInFile("names.txt");

        // Write the results to output.txt
        writeNameCountsToFile(nameCounts, "output.txt");
    }

    private static void createRandomNamesFile(String fileName, int numberOfNames) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {
            for (int i = 0; i < numberOfNames; i++) {
                // Generate a random index to pick a name
                int randomIndex = ThreadLocalRandom.current().nextInt(RANDOM_NAMES.length);
                writer.println(RANDOM_NAMES[randomIndex]);
            }
            System.out.println("Created names.txt with random names.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, Integer> countNamesInFile(String fileName) {
        Map<String, Integer> nameCounts = new HashMap<>();
        Path path = Paths.get(fileName);

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String name;
            while ((name = reader.readLine()) != null) {
                name = name.toLowerCase(); // Normalize to lowercase for case-insensitive counting
                nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return nameCounts;
    }

    private static void writeNameCountsToFile(Map<String, Integer> nameCounts, String outputFileName) {
        Path outputPath = Paths.get(outputFileName);

        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
                writer.write(entry.getKey() + " " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Output file created: " + outputPath.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

