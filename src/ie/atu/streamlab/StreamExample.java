package ie.atu.streamlab;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        // Create a list of integers from 1 to 10
        List<Integer> numbers = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());

        // Use a stream to filter out even numbers and print the remaining numbers
        numbers.stream()
                .filter(n -> n % 2 != 0) // Keep only odd numbers
                .forEach(System.out::println);
    }
}
