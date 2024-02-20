package review;

import java.util.Arrays;

public class HeapApp {

    public static void main(String[] args) {

        HeapTree heapTree = new HeapTree(10);

        heapTree.insert(61);
        heapTree.insert(120);
        heapTree.insert(52);
        heapTree.insert(45);
        heapTree.insert(81);

        System.out.println("Heap values after inserting");
        heapTree.print();
        System.out.println(heapTree.remove());

//        while (!heapTree.isEmpty()){
//            System.out.println(heapTree.remove());
//        }

        heapTree.print();
        heapTree.insert(130);
        System.out.println(heapTree.remove());
        System.out.println(heapTree.remove());
        System.out.println(heapTree.remove());
        System.out.println(heapTree.remove());
        System.out.println(heapTree.remove());
        heapTree.print();

        System.out.println(Arrays.toString(heapTree.elements));
    }
}
