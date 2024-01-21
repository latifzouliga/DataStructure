import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class MapReview {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergiu");
        map.put(2, "Moses");
        map.put(3, "Latif");

        System.out.println(map.get(3));

        System.out.println("First non repeating character in a string");
        firstNonRepeatingChar("Java__Developer");

        String s = "Developer";
        String[] chars = s.split("");
        Arrays.stream(chars)
                .filter(c -> Collections.frequency(Arrays.asList(chars), c) == 1)
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

    }


    /**
     * Find the first non-repeating char in a string
     * Example:
     * String = "Java Developer"
     * Output:
     * J
     */

    public static void firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char each : str.toCharArray()) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }
        System.out.println(map);
        for (Character each : map.keySet()) {
            if (map.get(each) >= 2) {
                System.out.println("First Repeating Char: " + each);
                break;
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= 1) {
                System.out.println("First Unique Char: " + entry.getKey());
                break;
            }
        }

        AtomicBoolean found = new AtomicBoolean(false);

        map.forEach((k, v) -> {
            if (v == 1) found.set(true);
            if (found.get()) return;
            System.out.println(k);
        });
    }

}
