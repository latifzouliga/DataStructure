package review;

import java.util.*;

public class SunsetViews {

    public static List<Integer> sunsetViews(int[] buildings, String direction) {


        Stack<Integer> stack = new Stack<>();

        int start = 0;
        int end = buildings.length;
        int steps = 1;
        if (direction.equals("west")){
            start = buildings.length -1;
            end = -1;
            steps = -1;
        }

        for (int i = start; i != end; i += steps) {

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }

        if(direction.equals("west")) Collections.reverse(stack);

        return stack;

    }

    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String directionWest = "west";
        String directionEast = "east";

        System.out.println("West: " + sunsetViews(buildings, directionWest));
        System.out.println("East: " + sunsetViews(buildings, directionEast));
    }
}
