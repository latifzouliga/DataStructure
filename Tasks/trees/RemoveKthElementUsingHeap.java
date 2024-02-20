package trees;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveKthElementUsingHeap {

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(getKthElement(nums, 2));
    }

    public static int getKthElement(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }

        PriorityQueue<Integer> heap = convertToHeap(arr);

        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }
        return !heap.isEmpty() ? heap.peek() : -1;

    }

    public static PriorityQueue<Integer> convertToHeap(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int each : arr) {
            heap.add(each);
        }
        return heap;
    }
}
