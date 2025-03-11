package ie.atu.streamlab;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        
        // Exercise 4
        // Create a list of integers from 1 to 5
        List<Integer> numbers = IntStream.rangeClosed(1, 5)
                                         .boxed()
                                         .collect(Collectors.toList());

        // Use method reference to double each number and print the results
        numbers.stream()
               .map(NumberUtils::doubleNumber) // Method reference to double the numbers
               .forEach(System.out::println); // Print each result using method reference
    }
}

// Utility class with a static method to double numbers
class NumberUtils {
    public static int doubleNumber(int num) {
        return num * 2;
    }
}

