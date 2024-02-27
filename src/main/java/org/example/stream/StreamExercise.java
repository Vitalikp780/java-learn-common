package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Filter out even numbers from the list.
Double each of the remaining numbers.
Find the sum of all the doubled numbers.
*/

public class StreamExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Step 1: Filter out even numbers
        // Hint: Use the filter() method
        // Hint: Use lambda expression to specify the condition for filtering
        // Hint: Use the modulo operator (%) to check if a number is even
        List<Integer> filteredNumbers = numbers.stream()
                .filter(i -> i % 2 != 0 )
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);

        // Step 2: Double each of the remaining numbers
        // Hint: Use the map() method
        // Hint: Use lambda expression to specify the transformation (multiply by 2)

        List<Integer> doubledNumbers = filteredNumbers.stream()
                .map(i -> i * 2)
                .toList();

        System.out.println(doubledNumbers);

        // Step 3: Find the sum of all the doubled numbers
        // Hint: Use the reduce() method
        // Hint: Use the sum() method of the Integer class as the binary operator
        int sum = doubledNumbers.stream().reduce(0, Integer::sum).intValue();

        System.out.println("Sum of doubled numbers: " + sum);
    }
}
