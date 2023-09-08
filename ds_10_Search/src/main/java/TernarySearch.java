public class TernarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 10, 11, 15, 20, 21, 30, 44, 67, 99};
        System.out.println(ternarySearchIterative(nums, 99));
        System.out.println(ternarySearchRecursive(nums,10));

    }

    public static int ternarySearchIterative(int[] array, int data) {
        int left = 0;
        int right = array.length - 1;

        while (right >= left) {

            int partition = (right - left) / 3;
            int leftPointer = left + partition;
            int rightPointer = right - partition;
            if (array[leftPointer] == data) return leftPointer;
            if (array[rightPointer] == data) return rightPointer;
            if (data < array[leftPointer]) right = leftPointer - 1;
            else if (data > rightPointer) left = rightPointer + 1;
            else {
                left = leftPointer + 1;
                right = rightPointer - 1;
            }

        }
        return -1;

    }

    public static int ternarySearchRecursive(int[] array, int data) {
        return ternarySearchRecursive(array, data, 0, array.length - 1);
    }

    public static int ternarySearchRecursive(int[] array, int data, int left, int right) {
        if (right < left) return -1;
        int partition = (right - left) / 3;
        int leftPointer = left + partition;
        int rightPointer = right - partition;
        if (array[leftPointer] == data) return leftPointer;
        if (array[rightPointer] == data) return rightPointer;
        if (data < array[leftPointer]) return ternarySearchRecursive(array, data, left, leftPointer - 1);
        if (data > array[rightPointer]) return ternarySearchRecursive(array, data, rightPointer + 1, right);
        else return ternarySearchRecursive(array, data, leftPointer + 1, rightPointer - 1);

    }

}
