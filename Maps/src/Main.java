import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        SortedMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        int[] money = {25, 100};

        for (int i : money) {
            map.computeIfPresent(i, (key, val) -> val + 1);
            map.putIfAbsent(i, 1);

            int changeDue = i - 25;

            while (changeDue > 0 && !map.isEmpty()) {
                if (map.tailMap(changeDue).size() == 0) {
                    break;
                }
                int value = map.tailMap(changeDue).firstKey();
                changeDue -= value;
                map.put(value, map.get(value) - 1);
                if (map.get(value) == 0) {
                    map.remove(value);
                }
            }

            if (changeDue == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }
}