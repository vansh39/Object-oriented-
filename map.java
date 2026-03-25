import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("After Insertion: " + map);

        // Deletion
        map.remove("B");
        System.out.println("After Deletion: " + map);

        // Updation
        map.put("A", 10);  // updates value
        System.out.println("After Updation: " + map);
    }
}