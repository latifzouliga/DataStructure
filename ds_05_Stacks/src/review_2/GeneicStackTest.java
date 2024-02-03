package review_2;

public class GeneicStackTest {

    public static void main(String[] args) {

        GStack<Integer> stack = new GStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
    }
}
