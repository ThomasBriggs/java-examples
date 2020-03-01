import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
}