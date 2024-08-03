package Array;
import java.util.ArrayList;
public class InsertAtPosition {

    public static void insertAtPosition(ArrayList<Integer> arr, int position, int value) {
        arr.add(position, value);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        insertAtPosition(arr, 1, 10);
        System.out.println(arr); // Result : [1, 10, 2, 3]
    }
}
