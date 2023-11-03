import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] array = {2, 7, 9, 11, 3};
        int target = 10;
        System.out.println(Arrays.toString(twoSum_1(array, target)));
        System.out.println(Arrays.toString(twoSum_2(array, target)));


    }


    public static int[] twoSum_1(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    public static int[] twoSum_2(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int v = target - array[i];
            if (map.containsKey(v)) {
                return new int[]{i, map.get(v)};
            }
            map.put(array[i], i);
        }
        return new int[0];
    }

}
