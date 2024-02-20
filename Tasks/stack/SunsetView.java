package stack;

import java.util.*;

public class SunsetView {

    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        int[] buildings1 = {6, 7, 2, 3, 4, 5};
        int[] buildings2 = {7, 6, 2, 2, 2, 3};

        System.out.println(sunsetView(buildings2, "east"));

    }

    public static List<Integer> sunsetView(int[] buildings, String direction) {


        Deque<Integer> stack = new ArrayDeque<>();

        int steps = 1;
        int end = buildings.length;
        int start = 0;
        if (direction.equals("west")) {
            steps = -1;
            end = -1;
            start = buildings.length - 1;
        }

        for (int i = start; i != end; i += steps) {

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
        }

        List<Integer> list = new ArrayList<>(stack);

        if (!direction.equals("west")) {
            Collections.reverse(list);
        }
        return list;
    }


}
