import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Insertion
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("After Insertion: " + set);

        // Deletion
        set.remove(20);
        System.out.println("After Deletion: " + set);

        // Updation (remove + add)
        set.remove(10);
        set.add(15);
        System.out.println("After Updation: " + set);
    }
}