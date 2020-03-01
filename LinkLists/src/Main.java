import java.util.LinkedList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Car> list = new LinkedList<>();
        list.add(new Car("Honda", "Green", 10));
        list.add(new Car ("Renault", "Black", 35));
        list.add(new Car ("Toyota", "Red", 12));
        list.add(new Car ("Kia", "Gray", 52));

        System.out.println(list.get(0).getName());
        System.out.println(list.size());
    }
}