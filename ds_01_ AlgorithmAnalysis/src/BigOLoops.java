public class BigOLoops {

    public static void main(String[] args) {

        long numberOfOperations = 0;
        int n = 100000;// size of  Data
        int m = 500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);



        System.out.println("\nSingle Loop................... O(n)");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations++;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " millisecond");



        System.out.println("\nNested Loops...................O(n ** 2)");

        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                numberOfOperations++;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");



        System.out.println("\nThree Nested Loops....................O(n ** 3)");

        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations++;
                }
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " millisecond");



        System.out.println("\nN and M Nested Loops...................O(n*m)");

        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                numberOfOperations++;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " millisecond");




        System.out.println("\nN and M Consecutive Loops...................O(n+m)");

        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            numberOfOperations++;
        }
        for (int i = 0; i < m; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");




        System.out.println("\nLogarithmic Complexity...................O(logn)");

        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i *= 2) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations  : " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

    }
}



