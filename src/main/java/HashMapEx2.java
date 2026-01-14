import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {

        String sentence = "Hello Hello Java Java Python";
        String[] words = sentence.split(" ");
        System.out.println("Original String = "+ Arrays.toString(words));

        Map<String,Integer> counts1 = new HashMap<>();
        for(String word:words)
        {
            counts1.put(word,counts1.getOrDefault(word,0)+1);
        }

        System.out.println("Count Repeated words");
        System.out.println(counts1);
        System.out.println();


        Map<String,String> counts = new HashMap<>();
        String s1 = "Hello Hello Java Java Python";
        System.out.println("Original String = "+s1);

        String[] w1 = s1.split(" ");
        Map<String, List<Integer>> indexes = new HashMap<>();

        for(int i=0;i<w1.length;i++)
        {
            String word = w1[i];
            if(indexes.containsKey(word))
            {
                List<Integer> currentList = indexes.get(word);
                currentList.add(i);
            }else{
                indexes.put(word,new ArrayList<>(List.of(i)));
            }
        }

        System.out.println("Word Position");
        System.out.println(indexes);
    }
}
