import java.util.*;

public class ListSetConversion {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry");
        Set<String> set = new HashSet<>(list);
        System.out.println("List to Set: " + set);

        List<String> newList = new ArrayList<>(set);
        System.out.println("Set to List: " + newList);
    }
}
