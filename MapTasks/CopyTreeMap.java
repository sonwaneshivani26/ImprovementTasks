import java.util.*;

public class CopyTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(1, "Apple");
        treeMap1.put(2, "Banana");
        treeMap1.put(3, "Cherry");

        TreeMap<Integer, String> treeMap2 = new TreeMap<>(treeMap1);
        System.out.println("Copied TreeMap: " + treeMap2);
    }
}
