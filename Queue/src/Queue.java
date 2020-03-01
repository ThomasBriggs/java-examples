import java.util.LinkedList;

/**
 * Queue
 */
public class Queue {

    LinkedList<Integer> list;

    Queue () {
        list = new LinkedList<>();
    }

    public void add(int value) {
        list.add(value);
    }

    public void remove() {
        list.removeFirst();
    }

    public String toString() {
        return list.toString();
    }
}