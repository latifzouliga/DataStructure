import java.util.*;

public class CollectionsQueue {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>(){{
            enqueue(1);
            enqueue(2);
            enqueue(3);
            enqueue(4);
        }};


        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        queue.enqueue(100);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        //queue.printQueue();
        System.out.println(queue);

        System.out.println("--------- Builtin Queue --------");
        // there are 2 Queue implementations in java: LinkedList and ArrayDeque
        Queue<Integer> javaQueue = new LinkedList<>();
        javaQueue.add(1);
        javaQueue.add(2);
        javaQueue.add(3);
        javaQueue.add(4);

        System.out.println("Remove: " + javaQueue.remove());
        System.out.println("Remove: " + javaQueue.remove());
        javaQueue.add(100);
        System.out.println("Queue size: " + javaQueue.size());
        System.out.println("Peek: " + javaQueue.peek());

        System.out.println(javaQueue);

        System.out.println("ArrayDeque");


        System.out.println("\nthe 3 implementations of Queue");

        Queue<Integer> arrayDeque = new ArrayDeque<>(List.of(2, 1, 3));    // array implementation
        Queue<Integer> linkedList = new LinkedList<>(List.of(2, 1, 3));    // Node implementation
        Queue<Integer> priorityQueue = new PriorityQueue<>(List.of(1,2,3)); // heap implementation

        System.out.println("arrayDeque");
        arrayDeque.forEach(System.out::println);

        System.out.println("linkedList");
        linkedList.forEach(System.out::println);

        System.out.println("priorityQueue");
        priorityQueue.forEach(System.out::println);







    }


}
