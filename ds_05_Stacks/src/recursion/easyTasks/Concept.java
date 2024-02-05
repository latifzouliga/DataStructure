package recursion.easyTasks;

public class Concept {

    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        //fun(n--); // cause stack overflow: n-- pass the value and then subtract
        // n-- vs --n
        fun(--n);  // subtract and then pass the value
    }
}
