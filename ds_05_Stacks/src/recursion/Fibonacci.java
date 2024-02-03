package recursion;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibo(50));

    }

    public static int fibo(int num){

        // base condition
        if (num <= 1){
            return num;
        }
        return fibo(num -1) + fibo(num -2);
    }
}
