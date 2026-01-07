import java.util.ArrayDeque;

public class ArrayDequeAsStack {

    public static void main(String[] args) {

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.push("Book1");
        arrayDeque.push("Book2");
        arrayDeque.push("Book3");
        arrayDeque.offerFirst("Book4");
        arrayDeque.offerLast("Book5");

        System.out.println(arrayDeque);

        System.out.println();

        System.out.println("Poll = "+arrayDeque.poll());

        System.out.println(arrayDeque);

        System.out.println();

        System.out.println("Poll First = "+arrayDeque.pollFirst());

        System.out.println(arrayDeque);

        System.out.println();

        System.out.println("Remove First = "+arrayDeque.removeFirst());

        System.out.println(arrayDeque);

    }

}
