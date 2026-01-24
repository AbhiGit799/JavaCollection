import java.util.*;

public class SortList {
    public static void main(String[] args) {
        Integer[] arr = {4,2,1,3};

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.sort(Comparator.naturalOrder());

        System.out.println("After Sorting = "+list);
        System.out.println();

        list.sort(Comparator.reverseOrder());
        System.out.println("Reverse Sorting = "+list);

        list.add(null);

        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));

        System.out.println("After Sorting = "+list);
        System.out.println();

        //Sorting String
        System.out.println("Sorting String");
        System.out.println();

        List<String> list1 = new ArrayList<>(List.of("Byyy","Dwwww","Cxx","azcvbgfre"));

        System.out.println("Before Sorting = "+list1);
        System.out.println();

        list1.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("Case sensitive sorting = "+list1);
        System.out.println();

        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        list1.sort(lengthComparator);

        System.out.println("Length Comparator Sorting = "+list1);
        System.out.println();

        Comparator<String> sortBySecondCharComparator = (String s1,String s2)->Integer.compare(s1.charAt(1),s2.charAt(1));
        list1.sort(sortBySecondCharComparator);

        System.out.println("After sorting = "+list1);
        System.out.println();

        Collections.sort(list1);
        Collections.sort(list1,String.CASE_INSENSITIVE_ORDER);

        Collections.sort(list1,Comparator.comparingInt(String::length));

        System.out.println();

        Collections.sort(list1,(String s1,String s2)->Integer.compare(s1.charAt(1),s2.charAt(2)));

        System.out.println(list1);

    }
}
