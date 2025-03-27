import java.util.*;

public class HashSetIteration {
    public static void main(String[] args) {
        Set<String> months = new HashSet<>(Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        ));

        System.out.println("Iterating over HashSet:");
        Iterator<String> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nHashSet does NOT preserve insertion order!");
    }
}
