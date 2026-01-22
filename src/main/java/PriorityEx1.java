import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityEx1 {
    public static void main(String[] args) {

        PriorityQueue<Customer> pq = new PriorityQueue<>();

        pq.add(new Customer(105,"John Doe",5));
        pq.add(new Customer(104,"Tim C",3));
        pq.add(new Customer(103,"Sandy Dee",1));

        PriorityQueue<Customer> pq1 = new PriorityQueue<>(5, Comparator.comparing(Customer::id));

        pq1.add(new Customer(105,"John Doe",5));
        pq1.add(new Customer(104,"Tim C",3));
        pq1.add(new Customer(113,"Sandy Dee",1));

        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());

    }
}
