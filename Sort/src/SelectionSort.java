/**
 * SelectionSort
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            Utility.swap(arr, i, smallest);
        }
    }
}