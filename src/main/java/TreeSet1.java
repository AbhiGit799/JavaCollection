import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>(Set.of(1,2,3,4,5,6));

        System.out.println("Subset = "+set.subSet(1,4));
        System.out.println("HeadSet = "+set.headSet(3));
        System.out.println("TailSet = "+set.tailSet(2));

        System.out.println("First = "+set.first());
        System.out.println("Last = "+set.last());
        System.out.println(set);

    }

}
