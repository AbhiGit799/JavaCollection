import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionInt1 {
    public static void main(String[] args) {

        Collection<Integer> collection1 = new ArrayList<>();

        collection1.add(1);

        Collection<Integer> collection2 = List.of(21,22,33,44,55,66);

        Collection<Integer> collection3 = new ArrayList<>(){{
            add(15);
            add(16);
            add(17);
        }};

        System.out.println("Collection1 = "+collection1);
        System.out.println();

        System.out.println("Collection2 = "+collection2);
        System.out.println();

        System.out.println("Collection3 = " + collection3);
        System.out.println();

        System.out.println("Collection1 IsEmpty = "+collection1.isEmpty());
        System.out.println();

        System.out.println("Size of collection1 = "+collection1.size());
        System.out.println();

        Iterator<Integer> iterator = collection1.iterator();

        while (iterator.hasNext())
        {
            Integer currValue = iterator.next();
            System.out.println("--->"+currValue);
        }

    }
}
