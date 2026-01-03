import java.util.ArrayDeque;

public class ArrayDequeAsQueue {
    public static void main(String[] args) {

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer("customer1");
        arrayDeque.offer("customer2");
        arrayDeque.addLast("customer3");
        arrayDeque.offer("customer4");
        arrayDeque.offer("customer5");
        arrayDeque.offer("customer6");

        System.out.println(arrayDeque);

        System.out.println("Peek{will not modify existing arrayDeque}="+arrayDeque.peek());

        System.out.println("Peek First{will not modify existing arrayDeque}=" + arrayDeque.peekFirst());

        System.out.println("Peek Last{will not modify existing arrayDeque}="+arrayDeque.peekLast());

        System.out.println("Poll{will modify existing arrayDeque}="+arrayDeque.poll());

        System.out.println("Poll First{will modify exisiting arrayDeque}="+arrayDeque.pollFirst());

        System.out.println("Poll Last{will modify exisitng arrayDeque}="+arrayDeque.pollLast());

        System.out.println(arrayDeque);

    }
}
