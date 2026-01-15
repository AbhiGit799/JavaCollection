import java.util.HashSet;
import java.util.Set;

public class HashsetEx2 {

    static HashSet<Integer> firstSet = new HashSet(Set.of(1,2,3,4,5,6));

    static HashSet<Integer> secondSet = new HashSet(Set.of(4,5,6,7,8,9));

    static HashSet<Integer> smallSet = new HashSet<>(Set.of(1,2,3));

    public static void main(String[] args) {

        SubSet(); // true Output
        System.out.println("After calling SubSet() = "+firstSet);
        System.out.println();

        union();
        System.out.println("After calling union() = "+firstSet);
        System.out.println();

        intersection();
        System.out.println("After calling intersection() = "+firstSet);
        System.out.println();

        difference();
        System.out.println("After calling difference() = "+firstSet);

        System.out.println();
        System.out.println(firstSet);
    }

    public static void SubSet()
    {
        boolean isSubSet = firstSet.containsAll(smallSet);

        System.out.println(isSubSet);
    }

    public static void union()
    {
        System.out.println(firstSet.addAll(secondSet));
    }

    public static void intersection()
    {
        System.out.println(firstSet.retainAll(secondSet));
    }

    public static void difference()
    {
        System.out.println(firstSet.removeAll(secondSet));
    }


}
