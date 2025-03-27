import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Three'? " + map.containsValue("Three"));

        System.out.println("Value for key 1: " + map.get(1));

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted Map: " + sortedMap);

        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}
