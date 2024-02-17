public class TernarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 10, 11, 15, 20, 21, 30, 44, 67, 99};
        System.out.println(ternarySearchIterative(nums, 99));
        System.out.println(ternarySearchRecursive(nums, 10));

    }

    public static int ternarySearchIterative(int[] array, int data) {
        int left = 0;
        int right = array.length - 1;

        while (right >= left) {

            int partition = (right - left) / 3;
            int midLeft = left + partition;
            int midRight = right - partition;

            if (array[midLeft] == data) {
                return midLeft;
            }
            if (array[midRight] == data) {
                return midRight;
            }

            if (data < array[midLeft]) {
                right = midLeft - 1;
            } else if (data > midRight) {
                left = midRight + 1;
            } else {
                left = midLeft + 1;
                right = midRight - 1;
            }

        }
        return -1;

    }

    public static int ternarySearchRecursive(int[] array, int data) {
        return ternarySearchRecursive(array, data, 0, array.length - 1);
    }

    // log3n
    public static int ternarySearchRecursive(int[] array, int data, int left, int right) {
        if (right < left) return -1;

        int partition = (right - left) / 3;
        int midLeft = left + partition;
        int midRight = right - partition;

        if (array[midLeft] == data) return midLeft;
        if (array[midRight] == data) return midRight;

        if (data < array[midLeft]) return ternarySearchRecursive(array, data, left, midLeft - 1);
        if (data > array[midRight]) return ternarySearchRecursive(array, data, midRight + 1, right);
        else return ternarySearchRecursive(array, data, midLeft + 1, midRight - 1);

    }

}
