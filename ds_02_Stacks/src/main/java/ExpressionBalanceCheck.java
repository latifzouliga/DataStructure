import java.util.*;

public class ExpressionBalanceCheck {

    public static void main(String[] args) {

        System.out.println(balanceCheck("(A+B) - ((C*N) / [f*(B/2)])"));


    }

    public static boolean balanceCheck(String expression) {

        MyStack<Character> stack = new MyStack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            List<Character> characters = new ArrayList<>();
            characters.addAll(Arrays.asList('(', ')', '{', '}', '[', ']'));

            if (!characters.contains(ch)) continue;;

//            if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}') {
//                continue;
//            }

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            switch (ch) {
                case ')':
                    if (stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.pop() != '{') return false;
                    break;
            }
        } // end of loop

        return stack.isEmpty();

    }
}













