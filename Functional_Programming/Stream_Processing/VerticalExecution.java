package Functional_Programming.Stream_Processing;

import java.util.stream.*;

public class VerticalExecution {
    /*
     * *
     * Each operation executes vertically on all
     * elements before moving to the next operation.
     * This is called vertical execution.
     */
    public static void main(String[] args) {
        Stream.of("Bihar", "Gujarat", "Goa").filter(s -> {
            System.out.println("filter: " + s);
            return true;
        }).forEach(s -> System.out.println("forEach() on " + s));
    }
}
