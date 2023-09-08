import static java.util.Arrays.binarySearch;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 10, 11, 15, 20, 21, 30, 44, 67, 99};
        System.out.println(exponentialSearch(nums,10));
    }

    public static int exponentialSearch(int[] array, int data){
        int bound = 1;
        while (bound < array.length && array[bound] < data){
            bound *= 2;
        }

        int left = bound/2;
        int right = Math.min(bound,array.length-1);
        return BinarySearch.binarySearchRecursive(array, data, left, right);
    }
}
