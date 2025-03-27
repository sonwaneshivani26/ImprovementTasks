import java.util.*;

public class SubMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        SortedMap<Integer, String> subMap = treeMap.subMap(2, 4);
        System.out.println("SubMap (2 to 4): " + subMap);
    }
}
