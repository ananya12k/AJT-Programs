import java.util.*;

import Iterator_Pattern.Iterator;

public class HashMap_Ex {
    public static void main(String[] args) {

        Map<Integer, String> n = new HashMap<>();
        n.put(1, "a");
        n.put(2, "b");
        n.put(3, "c");
        n.put(4, "d");
        n.put(5, "e");
        n.put(6, "f");
        String val = n.get(3);
        System.out.println(3 + " " + val);
        n.remove(3);
        // Iterator<Integer> it = n.keySet().iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
    }
}
