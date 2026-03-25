import java.util.*;

public class sortedmap  {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();

        // Insertion
        map.put("C", 3);
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("After Insertion: " + map);

        // Deletion
        map.remove("B");
        System.out.println("After Deletion: " + map);

        // Updation
        map.put("A", 100);
        System.out.println("After Updation: " + map);
    }
}