import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(null);
        numbers.add(90);
        numbers.add(91);
        numbers.add(92);
        numbers.add(93);
        numbers.add(94);
        numbers.add(95);
        System.out.println(numbers);
    }
}
