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

        System.out.println("-------------- HashMap ---------------------");
        HashMap<String,String> hashMap = new HashMap<>();







    }
}
