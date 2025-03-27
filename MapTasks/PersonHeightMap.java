import java.util.*;

public class PersonHeightMap {
    public static void main(String[] args) {
        Map<String, Double> personHeight = new TreeMap<>();
        personHeight.put("Bob", 6.0);
        personHeight.put("Alice", 5.6);
        personHeight.put("Charlie", 5.9);

        personHeight.remove("Charlie");

       System.out.println("Updated and sorted map: " + personHeight);
    }
}
