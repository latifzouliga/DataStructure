import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {100, 23, 1, 32, -10};

        divide(array);
        System.out.println(Arrays.toString(array));


        //System.out.println(Arrays.toString(sortAndMerge(a, b)));
    }

    /*
        Merge Sort is a Divide and Conquer algorithm
        The idea is breaking down the list into smaller and smaller sublists
        We continue to break down the list until we get a sublist with one element
        And then we sort sublists and merge them to produce sorted sublist/list
        Time Complexity: O(n log n)
        Space Complexity
     */


    // divide
    public static void divide(int[] array) {

        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        divide(left);
        divide(right);
        merge(left, right, array);

    }

    // merge
    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }



}
