import java.util.*;

public class RotateList {
    public static void rotateLeft(List<Integer> list, int positions) {
        Collections.rotate(list, -positions);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original list: " + list);

        rotateLeft(list, 2);
        System.out.println("List after rotating left by 2 positions: " + list);
    }
}
