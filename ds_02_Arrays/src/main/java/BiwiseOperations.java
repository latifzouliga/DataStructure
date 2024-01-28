package main.java;

import javax.crypto.spec.PSource;
import java.io.PrintStream;
import java.util.stream.IntStream;

public class BiwiseOperations {
    public static void main(String[] args) {
        int N = 120;
        for (int i = 0; i < 32; i++) {
            if (((N >> i) & 1) != 0)
                System.out.println("1");
            else System.out.println("0");
        }
        System.out.println("Integer.toBinaryString(27) = " + Integer.toBinaryString(-27));


    }

    // calculating a binary number of a decimal number
    // the first approach, we just need to start from the greatest number that can go one time into
    // the number that we want to convert to binary number, in this case 32 is greater than 27 so
    // we need to move to the next number which is 16, and 16 can go in 27 one time.

    // 27 ==>  32 16 8 4 2 1  ==> 1 1 0 1 1

    // the second approach is to divide the decimal number by 2, we keep the remainder which needs to be either
    // 0 or 1 , and we need to keep dividing the quotient by 2 until the quotient is 0,
    // 27/2 = q=13 , r=1
    // 13/2 = q=6  , r=1
    // 6 /2 = q=3  , r=0
    // 3 /2 = q=1  , r=1
    // 1 /2 = q=0  , r=1
    // result: 11011


}
