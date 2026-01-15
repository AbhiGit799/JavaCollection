import java.util.HashSet;
import java.util.Set;

public class HashsetEx1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(11);
        hashSet.add(22);
        hashSet.add(33);
        hashSet.add(44);

        System.out.println(hashSet);

        HashSet<Integer> hashSet1 = new HashSet(Set.of(1,2,3,4,5));

        System.out.println();
        System.out.println(hashSet1);

    }
}
