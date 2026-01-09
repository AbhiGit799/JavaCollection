import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(null);
        numbers.add(99);
        numbers.add(10);
        numbers.add(5);
        numbers.add(1,909);

        System.out.println(numbers);

    }
}
