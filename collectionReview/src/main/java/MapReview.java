import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergiu");
        map.put(2, "Moses");
        map.put(3, "Latif");

        System.out.println(map.get(3));

        System.out.println("First non repeating character in a string");
        firstNonRepeatingChar("JavaJ__Developer");


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

        char[] chaArray = str.toCharArray();
        for (char each : chaArray) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }
// 1:
//        for (char each : chaArray) {
//            if (map.get(each) == 1){
//                System.out.println(each);
//                break;
//            }
//        }

// 2:
//        for (Character character : map.keySet()) {
//            if (map.get(character) == 1){
//                System.out.println(character);
//                break;
//            }
//        }

// 3:
        for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() == 1) {
                System.out.println(eachEntry.getKey());
                break;
            }
        }


    }
}
