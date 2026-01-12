public record Employees(int id,String name,String gender,double salary,String jobTitle) implements Comparable<Employees> {


    @Override
    public int compareTo(Employees o) {
        return Integer.compare(this.id,o.id);
    }
}
