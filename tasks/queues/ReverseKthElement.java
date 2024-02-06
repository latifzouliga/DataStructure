package queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseKthElement {

    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(reverseFirstK(queue,4));
    }

    // returns stack
    public static Deque<Integer> reverseKthElement(Deque<Integer> queue, int kth){

        // 5 1 2 3 4  //
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < kth; i++) {
            queue.add(queue.pop());
        }

        while (!queue.isEmpty()){
            stack.push(queue.pop());
        }

       return stack;

    }


    // returns queue
    public static Deque<Integer> reverseFirstK(Deque<Integer> queue, int kth){


        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < kth; i++) {
            stack.push(queue.pop());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size() - kth; i++) {
            queue.add(queue.pop());
        }
        return queue;

    }

}
