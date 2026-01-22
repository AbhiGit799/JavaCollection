import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(99);
        numbers.add(45);
        numbers.add(66);
        numbers.add(6);

        System.out.println(numbers);
        System.out.println(numbers.poll());
        System.out.println(numbers);
        System.out.println();
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());

        System.out.println();

        PriorityQueue<String> letters = new PriorityQueue<>();
        letters.add("z");
        letters.add("s");
        letters.add("a");
        letters.add("A");

        System.out.println(letters);
        System.out.println(letters.poll());
        System.out.println(letters);

    }

}
