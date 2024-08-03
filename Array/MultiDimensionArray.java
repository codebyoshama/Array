package Array;
public class MultiDimensionArray {
    public static void main(String[] args) {
        // Initializing a 2D array
        int[][] arr = new int[3][4];
        // setting a value
        arr[1][2] = 5;
        // Accessing and printing the value
        System.out.println(arr[1][2]); // output : 5
        // Traversing 2D Array
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; i < arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Output
        // 0000
        // 0050
        // 0000
        // 0000
    }
}
