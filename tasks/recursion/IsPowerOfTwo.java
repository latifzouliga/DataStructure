package recursion;

public class IsPowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(11));
    }

    public static boolean isPowerOfTwo(int num){
        if (num % 2 == 0){
            return true;
        }

        if (num % 2 == 1){
            return false;
        }

        return isPowerOfTwo(num /2);
    }
}
