import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>(Map.of(1,"John",2,"Olivia"));

        String name = students.get(1);

        System.out.println(name);
        System.out.println();

        String name1 = students.get(3);
        System.out.println();

        String name2 = students.getOrDefault(5,"no-such-element");

        System.out.println(name2);
        System.out.println();

        Set<Integer> mKeys = students.keySet();

        System.out.println(mKeys);
        System.out.println();

        mKeys.forEach(s-> System.out.println("Key ="+s));
        System.out.println();

        Collection<String> mValues = students.values();
        mValues.forEach(v-> System.out.println("Values = "+v));

        System.out.println();

        for(Map.Entry<Integer,String>entry:students.entrySet())
        {
            System.out.println("Key = "+entry.getKey() + " Value = "+entry.getValue());
        }

        System.out.println();

        students.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        System.out.println();

        students.replace(1,"Tom");

        System.out.println();

        students.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        students.replaceAll((k,v)->v.toUpperCase()+"!!!!");

        System.out.println();

        students.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        System.out.println();

        students.merge(1,"New John",(oldValue,NewValue)->{
            System.out.println("Old Value = "+oldValue);
            System.out.println("New Value = "+NewValue);

            return NewValue;
        });
    }
}
