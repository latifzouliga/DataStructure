import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {

        //1. Given an integer K and a queue of integers, write code to reverse the order og the first K element of the queue.
        // Input: Q = [10, 20, 30, 40, 50]
        // Output: Q = [40,30,20,10,50]

        System.out.println("the solution with my MyQueue");
        MyQueue<Integer> myQueue = new MyQueue<>() {{
            enqueue(100);
            enqueue(200);
            enqueue(300);
            enqueue(400);
            enqueue(500);
        }};
        System.out.println("reverseFirstKMyQueue = " + reverseFirstKMyQueue(myQueue, 3));


        System.out.println("the solution using Deque");
        Deque<Integer> deque = new LinkedList<>() {{
            add(10);
            add(20);
            add(30);
            add(40);
            add(50);
        }};
        System.out.println("reverseFirstKDeque = " + reverseFirstKDeque(deque, 3));

        MyQueue<Integer> queue = new MyQueue<>() {{
            enqueue(1);
            enqueue(2);
            enqueue(3);
            enqueue(4);
            enqueue(5);
        }};
        System.out.println("reverseFirstK = " + reverseFirstK(queue, 3));

        // Given an array of Integers {10,6,8,20,4,9,5,17,42,47,29}


    }

    private static MyQueue<Integer> reverseFirstKMyQueue(MyQueue<Integer> myQueue, int k) {
        // TODO: REFACTOR reverse first k
        Stack<Integer> myStack = new Stack();

        for (int i = 0; i < k; i++) {
            myStack.push(myQueue.dequeue());
        }

        for (int i = 0; i < k; i++) {
            myQueue.enqueue(myStack.pop());
        }

        myStack.push(myQueue.dequeue());

        return myQueue;
    }

    private static Deque<Integer> reverseFirstKDeque(Deque<Integer> deque, int k) {

        Deque<Integer> stackQueue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            stackQueue.push(deque.pop()); // stackQueue is now a stack
        }

        // stackQueue is now a queue
        while (!deque.isEmpty()) {
            stackQueue.add(deque.pop());
        }

        return stackQueue;
    }


    public static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k) {

        Stack<Integer> stack = new Stack<>();

        // push first k element to stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }

        // enqueue elements int queue
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }

        // dequeue and enqueue size - elements
        for (int i = 0; i < queue.size() - k; i++) {
            queue.enqueue(queue.dequeue());
        }

        return queue;
    }
}
