import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> linkedList = new LinkedList<>();

        linkedList.push("Book1");
        linkedList.push("Book2");
        linkedList.push("Book3");

        System.out.println(linkedList);

        String poopedElement = linkedList.pop();

        System.out.println("Popped Element = "+poopedElement);

        System.out.println(linkedList);

        String peekedElement = linkedList.peek();

        System.out.println("Peeked Element = "+peekedElement);

        System.out.println(linkedList);

        linkedList.addFirst("first");
        linkedList.addLast("last");
        System.out.println(linkedList);

        System.out.println("Poll first remove first element = "+linkedList.pollFirst());

        System.out.println("Poll last remove last element = "+linkedList.pollLast());

        System.out.println(linkedList);


    }
}
