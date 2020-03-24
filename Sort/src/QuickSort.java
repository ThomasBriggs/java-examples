/**
 * QuickSort
 */
public class QuickSort {

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int wall = start;
        for (int i = start; i <= end - 1; i++) {
            if (arr[i] < pivot) {
                Utility.swap(arr, i, wall);
                wall++;
            }
        }

        Utility.swap(arr, wall, end);
        return wall;
    }

    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }
}