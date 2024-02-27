package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Filter out words that contain the letter 'e'.
Sort the remaining words in reverse alphabetical order.
Map the sorted words to their lengths.
Find the sum of the lengths of all the mapped words.
 */

public class StreamExercise4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList( "apple", "banana", "orange", "kiwi", "grape", "peach", "melon");

        List<String> filteredWords = words.stream()
                .filter(w -> !w.contains("e"))
                .toList();
        System.out.println(filteredWords);

        List<String> sortedWords = filteredWords.stream()
                .sorted(Comparator.reverseOrder())
//                .sorted(s1, s2) -> s2.compareTo(s1))
//                .sorted()
                .toList();
        System.out.println(sortedWords);

//        Map the sorted words to their lengths.
        int[] length = sortedWords.stream()
                .mapToInt(String::length).sorted().toArray();
        System.out.println(Arrays.toString(length));

//        Find the sum of the lengths of all the mapped words.
        int sum = Arrays.stream(length).reduce(0, Integer::sum);
        System.out.println(sum);

    }
}