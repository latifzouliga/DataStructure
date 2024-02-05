package recursion.easyTasks;

public class Nto1 {

    public static void main(String[] args) {

        System.out.println("natural order");
        fun(5);
        System.out.println("reversed");
        funRev(5);
        System.out.println("both");
        funBoth(5);

    }

    // print n and then call the other function
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funRev(n - 1);
    }

    // I will print the value when the next call is happened
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        System.out.println(n);

    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);

    }
}

