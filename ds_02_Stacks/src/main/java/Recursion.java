public class Recursion {

    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7  8  9
        // 0 1 1 2 3 5 8 13 21 34
        System.out.println(fibonacci(7));


        System.out.println(factorial(6));
    }

    public static int fibonacci(int number){
        if (number == 0) return 0;
        if (number == 1) return 1;
        return fibonacci(number -1 ) + fibonacci(number - 2);
    }

    public static int factorial(int number){
        if (number == 0) return 1;
        return number * factorial(number -1);
    }
}
