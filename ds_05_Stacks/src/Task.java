public class Task {

    public static void main(String[] args) {
        //TODO             0, 1, 2, 3, 4,5, 6, 7, 8
        int[] array = {3, 5, 4, 4, 3, 1, 3, 2};
        //direction = east;

        MyStack<Integer> stack = new MyStack<>();


        for (int i = 0; i < array.length -2; i++) {

            stack.push(i);
            if (array[i] < array[i +1]){
                stack.pop();

            } else if (array[i] == array[i +1]) {
                stack.pop();

            } else if (array[i] < array[i+1] && array[i] == array[i+2]) {
                stack.pop();
            }



        }
        stack.push(array.length -1);
        stack.printStack();


    }
}
