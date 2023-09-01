import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeapApp {

    public static void main(String[] args) {

        MyHeap heap = new MyHeap(10);

        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);

        heap.printHeap();

        System.out.println(heap.remove());
        heap.printHeap();
        heap.insert(130);
        heap.printHeap();
        heap.remove();
        heap.printHeap();
        heap.remove();
        heap.printHeap();



    }
}
