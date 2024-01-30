package review;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return; // Nothing to reverse if the stack is empty
        }

        // Create a temporary stack
        Stack<Integer> tempStack = new Stack<>();

        // Transfer elements from the original stack to the temporary stack
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        // Transfer elements back from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
