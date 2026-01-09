public record Customer(int id,String name,int priority) implements Comparable<Customer>{


    @Override
    public int compareTo(Customer o) {

        return Integer.compare(this.priority,o.priority);

    }
}
