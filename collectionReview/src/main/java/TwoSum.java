import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {


        int[] array = {2, 10, 7, 9, 5};
        int target = 12;

        // brute force
        int[] result = toSumBruteForce(array, target);
        System.out.println(Arrays.toString(result));

        // two sum with map
        int[] result2 = twoSumMap(array,target);
        System.out.println(Arrays.toString(result2));

    }

    public static int[] toSumBruteForce(int[] array, int target) {

        // time complexity: n*n => O(n^2)
        // space complexity: O(n)
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return array;
    }

    public static int[] twoSumMap(int[] array, int target){

        // time complexity: n+n with two loops or n with one loop. result => O(n)
        // space complexity: O(n)
        Map<Integer, Integer> map = new LinkedHashMap<>();

        //  adding all element in the array and their indexes to map
        //  for (int i = 0; i < array.length; i++) {
        //     map.put(array[i], i);
        //  }

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);  // we can use one separate loop to add all element and their indexes to map
            if (map.containsKey(target - array[i])){
                return new int[] {map.get(target - array[i]), i};
            }
        }
        return array;
    }
}
