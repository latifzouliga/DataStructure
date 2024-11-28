import java.util.LinkedHashMap;
import java.util.Map;

public class TODO {

    public static void main(String[] args) {

        System.out.println(compressMessage("abbbcccd"));

    }

    public static String compressMessage(String message) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (char each : message.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }


        for (Character key : map.keySet()) {
            int count = map.get(key);
            result.append(key);
            if (count > 1) {
                result.append(count);
            }
        }

        return result.toString();
    }
}


// TODO: Solving algorithm problems with stream

