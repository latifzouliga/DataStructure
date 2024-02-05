package recursion.intro;

public class BS {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int result = search(array, 15);
        System.out.println(result);


    }

    static int search(int[] array, int value, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;

        if (value == array[middle]) {
            return middle;
        }

        if (value < array[middle]) {
            return search(array, value, start, middle - 1);
        }

        return search(array, value, middle + 1, end);

    }

    static int search(int[] array, int value) {
        return search(array, value, 0, array.length - 1);
    }


}
