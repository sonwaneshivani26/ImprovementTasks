import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "apple", "banana", "apple", "cherry");

        System.out.println("Before replacement: " + list);
        Collections.replaceAll(list, "apple", "orange"); // Replace all "apple" with "orange"
        System.out.println("After replacement: " + list);
    }
}
