package recursion.easy;

public class DigitProduct {

    public static void main(String[] args) {
        System.out.println(digitsProduct(233));
        System.out.println(digitsProduct(505)); // should print 0
    }

    static int digitsProduct(int n) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * digitsProduct(n / 10);
    }
}
