package Array;
import java.util.ArrayList;
public class Searching {

    public static int linearSearch(ArrayList<Integer> arr, int target) {
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(linearSearch(arr, 2)); // Result : 1
    }
}
