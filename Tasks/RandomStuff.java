import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class RandomStuff {


    public static void main(String[] args) {

        int[] nums1 = {4, 1, 12, 0, 10, 7, 3, 4, -1, -10};


        System.out.println(freq(3, "xxxxxxxxxxxxxxxx"));


    }

    public static int freq(int m, String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        int[] array = map.values()
                .stream()
                .sorted((o1, o2) -> o2 - o1)
                .mapToInt(e -> e)
                .toArray();

        int cost = 0;
        int i = 0;

        while (m > 0 && i <= array.length - 1) {

            if (array.length == 1) {
                array[i] = array[i] - 1;
                m--;
            } else if (array[i] >= array[i + 1]) {
                array[i] = array[i] - 1;
                m--;
            } else{
                i++;
            }

        }


        // calculate cost and return it
        for (Integer num : array) {
            cost += num * num;
        }
        return cost;
    }


}









