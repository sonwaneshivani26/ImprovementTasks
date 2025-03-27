import java.util.*;

public class CompareSetOrders {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45, 78, 90, 1, 8, 0, 23);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
        System.out.println("LinkedHashSet (Preserves Insertion Order): " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(numbers);
        System.out.println("TreeSet (Sorted Order): " + treeSet);
    }
}
