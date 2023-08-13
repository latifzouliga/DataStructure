import java.util.*;

public class TestStack {

    public static void main(String[] args) {

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.loopMyStack();
        System.out.println("myStack.size = " + myStack.size);

        System.out.println("------- Popping elements from stack -------------");
        int size = myStack.size;
        for (int i = 0; i < size; i++) {
            System.out.println(myStack.pop());
        }

        myStack.printStack();
       // System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println();

        MyStack<String> stackOfStrings = new MyStack<>();
        stackOfStrings.push("A");
        stackOfStrings.push("B");
        stackOfStrings.push("C");
        stackOfStrings.push("D");
        stackOfStrings.push("Hello Java");

        stackOfStrings.loopMyStack();
        System.out.println("stackOfStrings.size = " + stackOfStrings.size);

        System.out.println();

        String str = "Latif";
        char[] ch = str.toCharArray();
        MyStack<Character> stack = new MyStack<>();
        for (char each : ch) {
            stack.push(each);
        }
        //Deque<String> stack = new LinkedList<>(Arrays.asList(str.split("")));
        System.out.println(stack);
        int s = stack.size;
        String result = "";
        for (int i = 0; i < s; i++) {
           result += stack.pop();
        }
        System.out.println(result);





    }
}
