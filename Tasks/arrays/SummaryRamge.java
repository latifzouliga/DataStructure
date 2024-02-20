package arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRamge {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRange(array));
    }

    public static List<List<Integer>> summaryRange(int[] array) {

        List<List<Integer>> list = new ArrayList<>();
        int i = 0;

        while (i < array.length) {
            int k = i;
            List<Integer> pairs = new ArrayList<>();
            while (i < array.length - 1 && array[i] + 1 == array[i + 1]) {
                i++;
            }
            pairs.add(array[k]);
            pairs.add(array[i]);
            list.add(pairs);
            i++;
        }
        return list;
    }
}

/*
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of
nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
 */