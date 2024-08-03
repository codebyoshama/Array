package Array;
import java.util.ArrayList;
public class Insertion {

    public static void insertEnd(ArrayList<Integer> arr, int val) {
        arr.add(val);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        insertEnd(arr, 4);
        System.out.println(arr); // Result [1, 2, 3, 4]

    }

}
