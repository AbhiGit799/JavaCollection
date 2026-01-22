import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer,String> students = new HashMap<>();

        students.put(1,"John");
        students.put(2,"Tom");
        students.put(2,"Tom Dome");

        System.out.println(students);
        System.out.println();

        Map<Integer,String> otherMap = new HashMap<>(Map.of(3,"Samantha",4,"Olivia"));

        students.putAll(otherMap);

        System.out.println(otherMap);
        System.out.println();

        students.putIfAbsent(1,"Ryan");
        System.out.println(students);
        System.out.println();

        students.computeIfAbsent(1,k->"Ryan");
        System.out.println(students);
        System.out.println();

        students.computeIfPresent(1,(k,v)->v.toUpperCase()+"!!");
        System.out.println(students);
        System.out.println();

        students.compute(2,(k,v)->v.toUpperCase()+"**");
        System.out.println(students);
        System.out.println();


        students.compute(5,(k,v)->{
            if(students.containsKey(k))
            {
                return v.toUpperCase()+"**";
            }
            return "Ryan";
        });

        System.out.println(students);

    }
}
