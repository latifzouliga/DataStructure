import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {100, 23, 1, 32, -10};

        System.out.println(Arrays.toString(selectionSort(array)));

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
            for (int j = i ; j < array.length; j++) {
                if (array[j] < array[minIndex]) minIndex = j;
            }
            swap(array, minIndex, i); // only one swap in evey pass
        }
        return array;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
