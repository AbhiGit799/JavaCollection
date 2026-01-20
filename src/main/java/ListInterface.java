import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("first");
        list.add("second");
        list.add(0,"newElement");

        System.out.println("list = "+list);
        System.out.println();

        List<String> list1 = new ArrayList<>(){{
            add("one");
            add("two");
        }};

        System.out.println("list1 = "+list1);
        System.out.println();

        list.addAll(1,list1);
        System.out.println("list.addAll() = "+list);

        System.out.println();
        System.out.println("list.get(3) = "+list.get(3));
        System.out.println();

        System.out.println("list = "+list);
        System.out.println();

        System.out.println("list.indexOf(second) = "+list.indexOf("second"));
        System.out.println("list.lastIndexOf(second) =   "+list.lastIndexOf("second"));
        System.out.println(list);
        System.out.println();

        list.replaceAll(s->s.toUpperCase());
        System.out.println(list);

        System.out.println();

        List<String> sublist = list.subList(0,2);
        System.out.println("sublist = "+sublist);
        System.out.println();

        list.set(0,"zeroElement");

        list.sort(String::compareTo);

        System.out.println(list);
        System.out.println();

        ListIterator<String> listIterator = list.listIterator(5);

        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
