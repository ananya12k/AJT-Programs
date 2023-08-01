import java.util.*;

import Iterator_Pattern.Iterator;

class Lists_GEN {
    public static void main(String[]args)
    {
        ArrayList <String>arr=new ArrayList<>(5);
        arr.add("10");
        arr.add("sun");
        arr.add("moon");
        arr.add("earth");
        arr.add("star");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });
        // Iterator it=arr.iterator();
        // // System.out.println(arr.get(0));
        // // System.out.println(arr.get(1));
        // while (it.hasNext()) {
        //     System.out.println(it.next()); 
            
        // }
    }
}