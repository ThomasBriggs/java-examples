import java.util.Arrays;

/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        int[] testArray = new int[1000];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i;
        }
        System.out.println(Arrays.toString(testArray));
        QuckSort(testArray);
        System.out.println(Arrays.toString(testArray));

    }

    static void QuckSort(int[] array) {
        QuckSort(array, 0, array.length - 1);
    }

    static void QuckSort(int[] array, int start, int end) {
        int left = start;
        int right = end;
        int length = end - start;
        int pivot = (start + end) / 2;

        while (left != right) {

            left = start;
            right = end;

            while (array[left] > array[pivot]) {
                left++;
            }

            while (array[right] < array[pivot]) {
                right--;
            }

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        if (length > 2) {
            QuckSort(array, start, pivot - 1);
            QuckSort(array, pivot + 1, end);
        }
    }
}