import java.util.Arrays;

public class PerformanceCalculationOfSearchMethods {

    public static void main(String[] args) {

        long[] array = new long[1000000];
        for (int i = 0; i < 1000000; i++) {
            array[i] = i;
        }

        System.out.println("Linear search execution time and number of comparisons");
        System.out.println(Arrays.toString(linearSearch(array, 333333)));

        System.out.println();

        System.out.println("ternary iterative search execution time and number of comparisons");
        System.out.println(Arrays.toString(ternarySearchIterative(array, 33334)));

        System.out.println();

        System.out.println("binary search execution time and number of comparisons");
        System.out.println(Arrays.toString(binarySearchIterative(array, 333333)));

        System.out.println();

        System.out.println("jump search execution time and number of comparisons");
        System.out.println(Arrays.toString(jumpSearch(array, 333333)));



        //TODO: This task is not done yet,
        // recursive search

        //System.out.println("ternary recursive search execution time and number of comparisons");
        //System.out.println(Arrays.toString(ternarySearchRecursive(array, 3333333)));


    }

    public static long[] linearSearch(long[] array, int data) {

        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;

        for (long each : array) {
            comparisons++;
            if (each == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }
        }
        return new long[2];
    }

    public static long[] binarySearchIterative(long[] array, int data) {

        long[] result = new long[2];
        long start = System.currentTimeMillis();
        int numOfExecutions = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;  // calculate the middle value
            numOfExecutions++;

            if (array[middle] == data) {
                result[0] = System.currentTimeMillis() - start;
                result[1] = numOfExecutions;
                return result;
            }

            numOfExecutions++;
            if (data < array[middle]) right = middle - 1; // branch to left
            else left = middle + 1;                       // branch to right
        }
        return new long[2];
    }

    public static long[] ternarySearchIterative(long[] array, int data) {

        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;

        int left = 0;
        int right = array.length - 1;

        while (right >= left) {
            int partition = (right - left) / 3;
            int leftPointer = left + partition;
            int rightPointer = right - partition;

            comparisons++;
            if (array[leftPointer] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }

            comparisons++;
            if (array[rightPointer] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }

            comparisons++;
            if (data < array[leftPointer]) right = leftPointer - 1;
            else if (data > rightPointer) left = rightPointer + 1;
            else {
                left = leftPointer + 1;
                right = rightPointer - 1;
            }
            comparisons++;

        }
        return new long[2];

    }

    public static long[] ternarySearchRecursive(long[] array, int data) {
        return ternarySearchRecursive(array, data, 0, array.length - 1);
    }

    public static long[] ternarySearchRecursive(long[] array, int data, int left, int right) {

        //TODO: NEEDS REVISED
        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        comparisons++;

        if (right < left) return new long[2];

        int partition = (right - left) / 3;
        int leftPointer = left + partition;
        int rightPointer = right - partition;

        if (array[leftPointer] == data) {
            result[0] = System.currentTimeMillis() - startTime;
            result[1] = comparisons;
            return result;
        }
        if (array[rightPointer] == data) {
            result[0] = System.currentTimeMillis() - startTime;
            result[1] = comparisons;
            return result;
        }
        if (data < array[leftPointer]) return ternarySearchRecursive(array, data, left, leftPointer - 1);
        if (data > array[rightPointer]) return ternarySearchRecursive(array, data, rightPointer + 1, right);
        else return ternarySearchRecursive(array, data, leftPointer + 1, rightPointer - 1);

    }


    public static long[] jumpSearch(long[] array, int data) {

        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;

        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (start < array.length && array[next - 1] < data) {
            start = next;
            next += blockSize;
            comparisons++;
            if (next > array.length) next = array.length;
        }

        for (int i = start; i < next; i++) {
            comparisons++;
            if (array[i] == data){
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }
        }

        return new long[2];
    }


}
