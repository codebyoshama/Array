package Array;
import java.util.ArrayList;
public class Traversal {
    public static void traverse(ArrayList<Integer> arr) {
        for(int i  = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        traverse(arr); // Result : 1 2 3

    }
}
