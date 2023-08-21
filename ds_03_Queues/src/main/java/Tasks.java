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
            enqueue(10);
            enqueue(20);
            enqueue(30);
            enqueue(40);
            enqueue(50);
        }};

        Stack<Integer> myStack = new Stack();
        int k = 4;
        for (int i = 0; i < k; i++) {
            myStack.push(myQueue.dequeue());
        }

        for (int i = 0; i < k; i++) {
            myQueue.enqueue(myStack.pop());
        }

        myStack.push(myQueue.dequeue());
        myQueue.enqueue(myStack.pop());
        System.out.println(myQueue);


        System.out.println("the solution using Deque");
        Deque<Integer> deque = new LinkedList<>() {{
            add(10);
            add(20);
            add(30);
            add(40);
            add(50);
        }};

        Deque<Integer> stackQueue = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            stackQueue.push(deque.pop()); // stackQueue is now a stack
        }
        stackQueue.add(deque.pop());     // stackQueue is now a queue
        System.out.println(stackQueue);

        int reduce = IntStream.range(1, 6).reduce(1, (a, b) -> a * b);
        System.out.println(reduce);







    }
}
