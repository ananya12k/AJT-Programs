package Functional_Programming.Stream_Processing;

import java.util.*;
import java.util.stream.*;

public class CollectStream {
    public static void main(String[] args) {
        List<State> states = Arrays.asList(
                new State("Assam", "Dispur"),
                new State("Bihar", "Patna"),
                new State("Gujarat", "Gandhinagar"),
                new State("Goa", "Panaji"),
                new State("Himachal Pradesh", "Shimla"),
                new State("Harayana", "Chandigarh"),
                new State("Maharashtra", "Mumbai"));
        List<State> stateNames = states.stream().filter(s -> s.StateName.startsWith("A")).collect(Collectors.toList());
        // Print Elements of stateNames
        stateNames.forEach(System.out::println);

    }
}
