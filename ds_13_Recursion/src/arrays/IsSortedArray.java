package arrays;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 16, 8};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr){
        return isSorted(arr,0);
    }
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] < arr[index + 1]) {
            return isSorted(arr, index + 1);
        }
        return false;
    }

}
