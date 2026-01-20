import java.util.LinkedHashMap;

public class LinkedHashMapEx2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students = new LinkedHashMap<>(5,0.75f,true);

        populateAndPrint(students);

        System.out.println();


    }


    public static void populateAndPrint(LinkedHashMap<Integer,String> students)
    {
        students.put(1,"one");
        students.put(2,"two");
        students.put(3,"three");
        students.put(4,"four");
        students.put(5,"five");
        students.put(6,"six");
        students.put(7,"seven");

        students.forEach((k,v)-> System.out.println(k+"->"+v));
    }
}
