import java.util.*;

class Lists_GEN {
    public static void main(String[]args)
    {
        ArrayList <String>arr=new ArrayList<>(5);
        arr.add("10");
        arr.add("sun");
        arr.add("moon");
        arr.add("earth");
        arr.add("star");
        Iterator it=arr.iterator();
        // System.out.println(arr.get(0));
        // System.out.println(arr.get(1));
        while (it.hasNext()) {
            System.out.println(it.next()); 
            
        }
    }
}