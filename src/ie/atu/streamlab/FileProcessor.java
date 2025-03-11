package ie.atu.streamlab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {
    public static void main(String[] args) {
        // Define the file path inside the resources folder
        Path filePath = Paths.get("resources/input.txt");
        String targetWord = "example"; // Change this word as needed

        try {
            // Read the file as a stream of lines
            long wordCount = Files.lines(filePath)
                .filter(line -> line.contains(targetWord)) // Count lines containing the word
                .count();

            // Calculate average line length
            double avgLength = Files.lines(filePath)
                .mapToInt(String::length) // Get the length of each line
                .average() // Calculate the average
                .orElse(0.0); // Default to 0 if the file is empty

            // Print results
            System.out.println("Number of lines containing \"" + targetWord + "\": " + wordCount);
            System.out.println("Average line length: " + avgLength);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}