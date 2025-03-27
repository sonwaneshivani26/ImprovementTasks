import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        Set<Integer> uniqueElements = new HashSet<>(set1);
        uniqueElements.addAll(set2);
        uniqueElements.removeAll(set1.retainAll(set2) ? set1 : new HashSet<>());

        System.out.println("Unique elements from both lists: " + uniqueElements);
    }
}
