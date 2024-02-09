import java.util.Arrays;

public class RandomStuff {


    public static void main(String[] args) {
        int[] arr = {0,1, 2, 3, 4};

        ;
        System.out.println(Arrays.toString(insetToBeginning(arr, 1111)));
        System.out.println(Arrays.toString(deleteFist_2(arr)));


    }

    public static int[] insetToBeginning(int[] array, int element) {
        int[] arr = new int[array.length +1];
        arr[0] = element;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = array[i-1];
        }
        return arr;
    }

    public static int[] deleteFist_1(int[] array) {
        return Arrays.copyOfRange(array,1,array.length);
    }

    public static int[] deleteFist_2(int[] array) {
        return Arrays.stream(array)
                .skip(1)
                .toArray();
    }



    public static void swapOther(int[] array) {
        for (int i = 0; i < array.length / 2; i += 2) {
            swap(array, i, array.length - 1 - i);
        }
    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
