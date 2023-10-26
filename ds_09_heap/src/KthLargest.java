
public class KthLargest {

    public static void main(String[] args) {

        int[] numbers = {3, 12, 1, 5, 6, 4};
        System.out.println(getKthLargest(numbers, 2));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    }


    public static int getKthLargest(int[] array, int k) {

        MyHeap heap = new MyHeap(array.length);

        for (int each : array) {
            heap.insert(each);
        }

        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }
        return heap.peek();

    }
}
