import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        List<Integer> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        System.out.println("Common elements: " + commonElements);

        List<Integer> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined list: " + joinedList);

        List<Integer> clonedList = new ArrayList<>(list1);
        System.out.println("Cloned list: " + clonedList);
    }
}
