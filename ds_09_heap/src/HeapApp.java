import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeapApp {

    public static void main(String[] args) {

        MyHeap heap = new MyHeap(13);

        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(20);
        heap.insert(12);
        heap.insert(11);
        heap.insert(81);
        heap.insert(81);
        heap.insert(61);
        heap.insert(51);
        heap.insert(111);
        heap.insert(88);

        heap.printHeap();

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        heap.printHeap();
        heap.insert(130);
        heap.printHeap();
        // heap.remove();
        //heap.printHeap();
        //heap.remove();
        //heap.printHeap();
//        System.out.println(Arrays.toString(heap.sort()));
//        heap.printHeap();
//
//        int[] array = {15, 21, 12, 16, 30, 1};
//        for (int j : array) {
//            heap.insert(j);
//        }
//        heap.printHeap();

        //[130, 81, 81, 61, 61, 52, 51, 45, 20, 12, 11]
        System.out.println(heap.largestKthElement(4));

        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < heap.size; i++) {

        }






    }
}
