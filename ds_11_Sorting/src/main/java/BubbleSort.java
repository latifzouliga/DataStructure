import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(bubbleSort(numbers)));

        Stream.iterate(0, n -> numbers[n+1])
                .limit(numbers.length-1)
                .forEach(System.out::println);

    }





    // the easiest sorting algo
    // comparing the element and the element next to it and swap them
    // time complexity: O(n^2)

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swap = true;
                }
            }
            if (!swap) return array;
        }
        return array;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
