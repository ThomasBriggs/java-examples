import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            test.add(i);
        }
        Integer[] arr = new Integer[test.size()];
        test.toArray(arr);
        System.out.println(arr[3]);
        int[] boop = test.stream().mapToInt(i -> i).toArray();
    }
}