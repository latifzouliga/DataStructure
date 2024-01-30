package review;

import java.util.*;

public class MyStckTest {

    public static void main(String[] args) {

        MyStack<Integer> stck = new MyStack<>();
        stck.push(10);
        stck.push(20);
        stck.push(30);
        stck.push(40);
        stck.push(50);

        System.out.println(stck.peek());

        System.out.println(stck.pop());

        while (!stck.isEmpty()) {
            System.out.println(stck.pop());
        }

        System.out.println(balancing("(a+b)-((c*d)/[f*(b/2)])"));
        System.out.println(balancing("(a+b)-(c(*d)/[f*(b/2)])"));
        System.out.println(balancing("(a+b)-((c*d)/[f*(b/2)])"));
        System.out.println(balancing("((A+B+(C-D))"));




    }

    public static boolean balancing(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (Character each : str.toCharArray()) {

            if (each == '(' || each == '{' || each == '[') {
                stack.push(each);
            } else {
                switch (each) {
                    case ')' -> {
                        if (stack.isEmpty() || stack.pop() != '(') {
                            return false;
                        }
                    }
                    case '}' -> {
                        if (stack.isEmpty() || stack.pop() != '{') {
                            return false;
                        }
                    }
                    case ']' -> {
                        if (stack.isEmpty() || stack.pop() != '[') {
                            return false;
                        }
                    }
                }
            }
        }
        return stack.isEmpty();

    }





}
















