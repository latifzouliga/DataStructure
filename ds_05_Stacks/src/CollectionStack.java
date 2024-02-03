import java.util.*;

public class CollectionStack {
    public static void main(String[] args) {

        // Deque or Double ended queue. It is an Interface that allows us to insert and remove data from both ends
        // stack in Collection
        System.out.println("-------------- Stack ------------");
        // Stack is LIFO or last in first out
        // to use stack we need to use Deque interface as reference type
        // we also need to stack methods like push(), peek(), pop()
        Deque<Integer> cStack = new LinkedList<>();

        cStack.push(1);
        cStack.push(2);
        cStack.push(3);
//        System.out.println("cStack.peek() = " + cStack.peek());
//        System.out.println("cStack.pop() = " + cStack.pop());
//        System.out.println("cStack.peek() = " + cStack.peek());
        System.out.println(cStack);
        System.out.println("cStack.pop() = " + cStack.pop());
        System.out.println("cStack.pop() = " + cStack.pop());
        System.out.println("cStack.pop() = " + cStack.pop());


//        System.out.println("------------ Legacy Stack ------------");
//        // legacy stack is still in use, but it is recommended to use Deque interface instead
//        Stack<String> legacyStack = new Stack<>();
//        legacyStack.push("A");
//        legacyStack.push("B");
//        legacyStack.push("C");
//        System.out.println(legacyStack);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());




    }


}
