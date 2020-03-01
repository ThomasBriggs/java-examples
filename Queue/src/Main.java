/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Queue test = new Queue();
        test.add(5);
        test.add(10);
        test.add(54);
        System.out.println(test);

        test.remove();
        System.out.println(test);

        test.add(99);
        System.out.println(test);
    }   
}