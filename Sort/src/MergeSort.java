/**
 * MergeSort
 */
public class MergeSort {

    private static void merge(int[] arr, int start, int middle, int end) {
        int length = end - start + 1;
        int left = start;
        int right = middle + 1;
        int[] temp = new int[length];
        int i = 0;

        while (left <= middle && right <= end) {
            if (arr[left] < arr[right]) {
                temp[i] = arr[left];
                left++;
            } else {
                temp[i] = arr[right];
                right++;
            }
            i++;
        }

        while (left <= middle) {
            temp[i] = arr[left];
            left++;
            i++;
        }

        while (right <= end) {
            temp[i] = arr[right];
            right++;
            i++;
        }

        for (i = 0; i < length; i++) {
            arr[start] = temp[i];
            start++;
        }
    }

    static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            sort(arr, start, middle);
            sort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }
    }

    static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }
}