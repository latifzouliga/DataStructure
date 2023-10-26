import static java.util.Arrays.binarySearch;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 10, 11, 15, 20, 21, 30, 44, 67, 99};
        System.out.println(exponentialSearch(nums, 10));
    }


    // it is very similar to jump search
    // Instead of jumping with  a fixed steps, in Exponential search we double the block size and comparing the data with the last element in the block
    // In Exponential search we double the block at each iteration but in the same time we start searching from the half of the block
    // if the last element in the block is greater than the data, then we perform binary search
    // It is jumping by doubling the block + binary search
    // time complexity: O(logn)
    // Space complexity: O(1)
    public static int exponentialSearch(int[] array, int data) {
        int bound = 1;
        while (bound < array.length && array[bound] < data) {
            bound *= 2;
        }

        // when the last element in the block is greater than data, we perform binary search
        int left = bound / 2; // cutting the block into half
        int right = Math.min(bound, array.length - 1); // if the bound is greater than the length of data size then we choose the length
        return BinarySearch.binarySearchRecursive(array, data, left, right);
    }
}
