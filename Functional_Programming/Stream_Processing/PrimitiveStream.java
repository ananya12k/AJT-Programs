package Functional_Programming.Stream_Processing;

import java.util.stream.*;

public class PrimitiveStream {
    public static void main(String[] args) {
        // Creating a stream of integers
        IntStream.range(1, 4).forEach(System.out::println);
        // Primitive streams support the additional terminal aggregate operations sum()
        // and average():
        IntStream.range(1, 4).average().ifPresent(System.out::println);

        // Converting from regular object stream to primitive stream
        Stream.of("1", "2", "3").mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

        // Primitive streams can be converted to object streams via mapToObj():
        IntStream.range(1, 4).mapToObj(i -> "+").forEach(System.out::println);
    }

}