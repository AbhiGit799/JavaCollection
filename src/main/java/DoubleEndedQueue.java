import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueue {
    public static void main(String[] args) {

        //1) Queue(FIFO) with ArrayDeque

        System.out.println("Queue Using Deque");
        Deque<String> q = new ArrayDeque<>();
        q.offer("A");
        q.offer("B");
        q.offer("C");
        q.offer("D");

        q.forEach(s-> System.out.println(s));

        System.out.println();
        System.out.println("Using Iterator()");
        System.out.println(q.iterator().next());
        System.out.println("Using Descending Iterator()");
        System.out.println(q.descendingIterator().next());

        System.out.println();

        System.out.println("Queue poll() = "+q.poll());
        System.out.println("Queue peek() =  "+q.peek());
        System.out.println();
        q.forEach(s-> System.out.println(s));

        System.out.println();

        // 2) Stack (LIFO) with ArrayDeque<>()
        System.out.println("Stack Using Deque");

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.forEach(s-> System.out.println(s));

        System.out.println();
        System.out.println("Stack pop() = "+stack.pop());
        System.out.println("Stack peek() = "+stack.peek());
        System.out.println();
        stack.forEach(s-> System.out.println(s));

        System.out.println();
        System.out.println("AddFirst,AddLast");

        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(2);
        d.addFirst(1);
        d.addLast(3);
        System.out.println(d);
        System.out.println();
        d.offerFirst(10);
        d.offerLast(15);
        System.out.println(d);


    }
}
