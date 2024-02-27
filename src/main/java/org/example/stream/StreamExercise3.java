package org.example.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
Filter out persons whose age is greater than 30.
Map the remaining persons to their names.
Sort the names alphabetically.
Concatenate all the sorted names into a single comma-separated string.
*/

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamExercise3 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Charlie", 30),
                new Person("Alice", 25),
                new Person("Bob", 40),
                new Person("David", 35),
                new Person("Eve", 45)
        );

        //Filter out persons whose age is greater than 30.
        List<Person> filteredPersons = persons.stream()
                .filter(p -> p.getAge() <= 30)
                .toList();

        System.out.println(filteredPersons);

        //Map the remaining persons to their names

        List<String> names = filteredPersons.stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());
//        List<String> names = filteredPersons.stream()
//        .map(Person::getName)
//        .collect(Collectors.toList());

        System.out.println(names);

//        Sort the names alphabetically.
        names.sort(String::compareTo);
        System.out.println(names);

//        Concatenate all the sorted names into a single comma-separated string.
        String concat = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated names: " + concat);

    }
}
