package Hackerrank;

import java.lang.reflect.Method;
import java.util.PriorityQueue;

public class JavaReflectionMethods {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();
        Class<?> student = Student.class;

        Method[] methods = student.getDeclaredMethods();

        for (Method each : methods) {
            String method = each.getName();
            queue.add(method);
        }

       while (!queue.isEmpty()){
           System.out.println(queue.poll());
       }
    }
}
