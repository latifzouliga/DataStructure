package arrays;

import java.util.HashMap;
import java.util.Map;

public class CandleCost {

    public static void main(String[] args) {



        System.out.println(candleCost(3, "xxxxxxxxxxxxxxxx"));


    }

    public static int candleCost(int m, String str) {

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
