package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            try {
                power(n, p);
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }

    public static void power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            int result = (int) Math.pow(n, p);
            System.out.println(result);
        }
    }

}
