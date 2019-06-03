
import java.util.Arrays;

/**
 * Created by Thomas Briggs on 10/03/2017.
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] ints = {4, 1, 3, 2};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }

}
