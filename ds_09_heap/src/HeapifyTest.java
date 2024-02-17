public class HeapifyTest {

    public static void main(String[] args) {

        int[] arr = {2,7,9,11,23,-1};
        MyHeap heap = new MyHeap(arr);
        heap.printHeap();

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }
}
