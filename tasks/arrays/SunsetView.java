package arrays;

import java.util.*;

public class SunsetView {

    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};

        System.out.println(sunset(buildings));
        System.out.println(sunsetMap(buildings));
    }


    public static List<Integer> sunset(int[] array) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int max = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] >= array[i]) {
                    max = array[i];
                }
            }

            if (array[i] > max) {
                list.add(i);
            }
        }
        return list;
    }

    public static List<Integer> sunsetMap(int[] buildings) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < buildings.length - 1; i++) {
            int first = buildings[i];
            int second = buildings[i + 1];
            if (first <= second) {
                map.put(second, i + 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.add(buildings.length - 1);
        System.out.println(map);
        return list;
    }

}
