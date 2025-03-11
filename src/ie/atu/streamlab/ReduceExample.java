package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Calculate the product of all numbers
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b); // Multiplication reduce operation

        // Find the minimum value
        Optional<Integer> minValue = numbers.stream()
                                            .reduce(Integer::min); // Find the minimum using reduce

        // Print the results
        System.out.println("Product: " + product);
        minValue.ifPresent(min -> System.out.println("Minimum value: " + min));
    }
}