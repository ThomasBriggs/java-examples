/**
 * InsertionSort
 */
public class InsertionSort {

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                Utility.swap(arr, j, j - 1);
                j--;
            }
        }
    }
}