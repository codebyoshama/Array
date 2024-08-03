package Array;
import java.util.ArrayList;
public class Deletion {
    public static void deleteEnd(ArrayList<Integer> arr) {
        if(!arr.isEmpty()) {
            arr.remove(arr.size()-1);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        deleteEnd(arr);
        System.out.println(arr);  // Result:  [1, 2]
    }
}
