package org.example.stream;

import java.util.Arrays;
import java.util.List;
/*
Filter out strings that start with the letter 'A'.
Convert the remaining strings to uppercase.
Concatenate all the uppercase strings into a single string.
*/

public class StreamExercise2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Orange", "Apricot");

        // Step 1: Filter out strings that start with the letter 'A'
        // Hint: Use the filter() method
        // Hint: Use lambda expression to specify the condition for filtering
        List<String> filteredStrings = words.stream()
                .filter(w -> !w.startsWith("A"))
                .toList();

        System.out.println(filteredStrings);


        // Step 2: Convert the remaining strings to uppercase
        // Hint: Use the map() method
        // Hint: Use the toUpperCase() method of the String class
        List<String> uppercasedStrings = filteredStrings.stream()
                .map(w -> w.toUpperCase())
                .toList();

        System.out.println(uppercasedStrings);

        // Step 3: Concatenate all the uppercase strings into a single string
        // Hint: Use the reduce() method
        // Hint: Use the concat() method of the String class as the binary operator
        String concat = uppercasedStrings.stream().reduce("", String::concat).toString();

        System.out.println("Concatenated string: " + concat);
    }
}
