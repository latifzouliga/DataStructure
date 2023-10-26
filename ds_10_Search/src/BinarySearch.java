import java.util.Random;
import java.util.stream.Stream;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6, 8, 10, 11, 15, 20, 21, 30, 44, 67, 99};

        // returns the index of element
        System.out.println(binarySearchIterative(nums, 20));

        // returns the index of element
        System.out.println(binarySearchRecursive(nums, 6));


    }


    // We must apply binary search algorithm  sorted arrays only
    // In Binary search, the array will be divided into to parts left and right on each iteration
    // if the value we are looking for is less the left, we branch to right else, we branch to right
    // time complexity: O(log n)
    // space complexity: O(1)
    public static int binarySearchIterative(int[] array, int data) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;  // calculate the middle value
            if (array[middle] == data) return middle;
            if (data < array[middle]) right = middle - 1; // branch to left
            else left = middle + 1;                       // branch to right
        }
        return -1;
    }


    // time complexity: O(log n)
    // space complexity:
    public static int binarySearchRecursive(int[] array, int data) {
        return binarySearchRecursive(array, data, 0, array.length - 1);
    }

    public static int binarySearchRecursive(int[] array, int data, int left, int right) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (array[middle] == data) return middle;
        if (data < array[middle]) return binarySearchRecursive(array, data, left, middle - 1);
        else return binarySearchRecursive(array, data, middle + 1, right);
    }


}












