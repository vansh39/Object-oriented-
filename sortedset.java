import java.util.*;

public class sortedset  {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        // Insertion
        set.add(50);
        set.add(10);
        set.add(30);
        System.out.println("After Insertion: " + set);

        // Deletion
        set.remove(30);
        System.out.println("After Deletion: " + set);

        // Updation (remove + add)
        set.remove(10);
        set.add(25);
        System.out.println("After Updation: " + set);
    }
}