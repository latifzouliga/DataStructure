import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {100, 23, 1, 32, -10};
        System.out.println(Arrays.toString(selectionSort(array)));

        int[] array2 = {100, 23, 1, 32, -10};
        selectionSort_2(array2);
        System.out.println(Arrays.toString(array2));
    }

    /*
        Selection sort algorithm sorts an array by repeatedly finding the minimum element
        from unsorted part of the  array and putting it in the beginning
        The algorithm maintains two parts in a given array
        - The part which is sorted
        -  The remaining part which is unsorted
        In every Iteration the minimum is picked from unsorted part and moved to the sorted part
        It is similar to bubble sort except that there is only one swap in each pass
     */
    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i); // only one swap in evey pass
        }
        return array;
    }


    // ============== same approach but seperated into 3 methods ============
    public static void selectionSort_2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = getMinIndex(array, i);
            swap(array, i, min);
        }
    }

    public static int getMinIndex(int[] arr, int index) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // ==================================================================
    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }


}
