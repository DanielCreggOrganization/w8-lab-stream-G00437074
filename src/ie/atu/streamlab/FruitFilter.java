package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FruitFilter {
    public static void main(String[] args) {
        // Create a list of fruit names
        List<String> fruits = Arrays.asList("apple", "banana", "grape", "kiwi", "orange", "mango");

        // Process the list using streams
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.length() > 4) // Filter names longer than 4 characters
                .sorted() // Sort alphabetically
                .map(String::toUpperCase) // Convert to uppercase
                .collect(Collectors.toList()); // Collect into a new list

        // Print the results
        System.out.println(filteredFruits);
    }
}
