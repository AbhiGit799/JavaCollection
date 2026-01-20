import java.util.LinkedList;
import java.util.Queue;

public class LinkedList1 {
    public static void main(String[] args) {
        Queue<String> linkedlist = new LinkedList<>();

        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");

        System.out.println(linkedlist);
        System.out.println();

        String element = linkedlist.poll();

        System.out.println("Poll Element = "+element);
        System.out.println(linkedlist);

        String toKnowhead = linkedlist.peek();
        System.out.println("Peek = "+toKnowhead);
        System.out.println(linkedlist);


    }
}
