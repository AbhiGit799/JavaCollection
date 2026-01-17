import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students = new LinkedHashMap<>();

        students.put(101,"John");
        students.put(102,"Sandy");
        students.putIfAbsent(101,"Tom");

        System.out.println(students);
        System.out.println();

        students.putIfAbsent(103,"Tom");

        students.computeIfAbsent(104,k->"Ryan");

        System.out.println(students);
        System.out.println();

        students.computeIfPresent(101,(k,v)->v.toUpperCase());

        System.out.println(students);
        System.out.println();


        System.out.println(students.get(101));
        System.out.println(students.keySet());
        System.out.println(students.values());
        System.out.println();

        for(Map.Entry<Integer,String>entry:students.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }



    }
}
