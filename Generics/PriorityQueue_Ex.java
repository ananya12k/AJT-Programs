import java.util.*;
public class PriorityQueue_Ex {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove(1));
        q.add(4);
        int a=q.peek();
        System.out.println(a);
        System.out.println(q.poll());
        System.out.println(q);
        Iterator iterator = q.iterator();
 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
