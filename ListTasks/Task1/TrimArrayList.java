import java.util.ArrayList;

public class TrimArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10); 
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Before trimming: " + list);
        list.trimToSize(); 
        System.out.println("After trimming: " + list);
    }
}
