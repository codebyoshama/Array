package Array;
import java.util.ArrayList;
public class DeletingAtSpecificPosition {

    public static void deleteAtPosition(ArrayList<Integer> arr, int position) {
       if(position >= 0 && position < arr.size()) {
           arr.remove(position);
       }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        deleteAtPosition(arr, 1);
        System.out.println(arr); // Result [1, 3]
    }
}
