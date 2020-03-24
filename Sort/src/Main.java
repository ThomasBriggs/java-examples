import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = { 197, 79, 89, 70, 4, 60, 184, 3, 3, 145, 193, 23, 78, 69, 73, 1, 25, 133, 89, 83 };
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}