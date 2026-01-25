import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {

        NavigableSet<Integer> set = new TreeSet<>(Set.of(2,4,6,8));

        System.out.println("Set = "+set);
        System.out.println();

        System.out.println("Descending Set = "+set.descendingSet());
        System.out.println(set);
        System.out.println();

        System.out.println("HeadSet = "+set.headSet(6,false));

        System.out.println("TailSet = "+set.tailSet(2,false));

        System.out.println("Lower = "+set.lower(2));

        System.out.println("Higher = "+set.higher(2));

        System.out.println("PollFirst = "+set.pollFirst());

    }
}
