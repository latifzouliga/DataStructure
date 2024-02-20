import java.util.Arrays;

public class Heapify {


    public static void main(String[] args) {
        int[] array = {4, 10, 3, 5, 1};

        System.out.println(Arrays.toString(array));
        heapify(array);

        printArray(array);


    }

    public static void heapify(int[] arr) {

        int mid = arr.length / 2;
        for (int i = mid - 1; i >= 0; i--) {
            heapifyUtil(arr, mid, i);
        }
    }

    //public static void heapifyUtil(int[] arr, int i, int mid) {
//
//        int max = i;
//        int left = i * 2 + 1;
//        int right = i * 2 + 2;
//
//        // find the largest
//        if (left < mid && arr[left] > arr[right]) {
//            max = left;
//        }
//
//        if (right < mid && arr[right] > arr[left]) {
//            max = right;
//        }
//
//        if (max != i) {
//            int temp = arr[i];
//            arr[i] = arr[max];
//            arr[max] = temp;
//
//            heapifyUtil(arr, i, max);
//        }


   // }

    private static void heapifyUtil(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left, right;

        while (true) {
            left = 2 * i + 1; // Left child
            right = 2 * i + 2; // Right child

            // If left child is larger than root
            if (left < n && array[left] > array[largest]) {
                largest = left;
            }

            // If right child is larger than largest so far
            if (right < n && array[right] > array[largest]) {
                largest = right;
            }

            // If largest is not root
            if (largest != i) {
                // Swap root with the largest element
                int temp = array[i];
                array[i] = array[largest];
                array[largest] = temp;

                i = largest; // Update i to largest, for further checking
            } else {
                break; // Break the loop if no swaps needed
            }
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


}
