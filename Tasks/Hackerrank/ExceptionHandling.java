package Hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            int x = scanner.nextInt();
            scanner.nextLine();
            int y = scanner.nextInt();
            int result = x / y;
            System.out.println(result);
        }catch (InputMismatchException | ArithmeticException e){
            if (e.toString().startsWith("java.util.InputMismatchException")){
                System.out.println("java.util.InputMismatchException");
            }else {
                System.out.println(e.toString());
            }
        }

    }


}
