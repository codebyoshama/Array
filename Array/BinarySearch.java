package Array;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static int binarySearch(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr.get(mid) == target) {
                return mid;
            }else if(arr.get(mid) < target) {
                left = mid + 1;
            }else {
                 right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1,2,3,4,5);
        System.out.println(binarySearch(arr, 3)); // Result 2
    }
}
