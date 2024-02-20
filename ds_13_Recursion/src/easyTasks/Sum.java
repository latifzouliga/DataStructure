package easyTasks;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    // print the sum of all digits of a given number
    // f(5) = 5 + 4 + 3 + 2 + 1
    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

}
