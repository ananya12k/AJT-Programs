package Functional_Programming.Stream_Processing;

import java.util.*;
import java.util.stream.Stream;

public class StreamDirect {
    public static void main(String[] args) {
        Stream.of("Gujarat", "Goa").findFirst().ifPresent(System.out::println);
    }
}
