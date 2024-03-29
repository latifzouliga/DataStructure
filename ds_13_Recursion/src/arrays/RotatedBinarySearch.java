package arrays;

import java.util.Arrays;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 2, 0, arr.length - 1));
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(array, 2)));

    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = (s + e) / 2;
        if (arr[m] == target) {
            return m;
        }

        // check if the first part of the array is sorted
        if (arr[s] <= arr[m]) {

            // check if the element lies between s and m elements
            if (target >= arr[s] && target <= arr[m]) {
                // search in this part
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }

        return search(arr, target, s, m - 1);
    }

    public static int[] rotateArray(int[] array, int position) {

        int count = 0;
        while (position > count) {
            int temp = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = temp;
            count++;
        }
        return array;
    }



}
