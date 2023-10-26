import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {100, 23, 1, 32, -10};

        System.out.println(Arrays.toString(insertionSort(array)));
    }

    /*
        It is similar to Selection sort, because there are to parts of array; sorted part and unsorted part
        Picking up the first element next to the last element of sorted array and compare it with the last element of sorted part of array and insert it into it
        We start with comparing the first two element and sort them and
        Performance is similar to bubble sort
        Time complexity: O(n^2)
     */

    public static int[] insertionSort(int[] array) {

        // starting from index one
        // assuming that the index 0 is sorted and index one is not
        for (int i = 1; i < array.length; i++) {

            int toBeInserted = array[i]; // the last element in the sorted part of array
            int j = i - 1; // predecessor
            // shifting element to create space for the element we want to insert
            while (j >= 0 && toBeInserted < array[j]) {
                // we compare toBeInserted to each element starting from the last sorted element
                // If toBeInserted is less the predecessor element we perform shift operation and degrease the index
                array[j + 1] = array[j];
                j--;
            }
            // inserting toBeSelected to its position
            array[j + 1] = toBeInserted;
        }
        return array;
    }

}
