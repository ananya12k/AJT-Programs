package Functional_Programming.Stream_Processing;

import java.lang.reflect.Array;
import java.util.*;

public class StreamFromList {
    public static void main(String[] args) {
        // Streams cannot be reused
        List<String> indiaStates = Arrays.asList("Assam", "Bihar", "Gujarat", "Goa", "Himachal Pradesh", "Harayana",
                "Maharashtra");
        indiaStates.stream().filter(state -> state.startsWith("H")).map(String::toUpperCase).sorted()
                .forEach(System.out::println);
        List<String> Fruits = Arrays.asList("Mango", "Papaya", "Apple", "Pear", "Kiwi", "Banana", "Orange");

        // We perform filter() first before map()
        // Map() and forEach() is performed only on the filtered elements
        Fruits.stream().filter(fruit -> fruit.startsWith("P")).map(String::toUpperCase).sorted()
                .forEach(System.out::println);
    }
}
