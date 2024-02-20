package trees.oracle;

public class Test {

    public static void main(String[] args) {

        Tree tree = new Tree();


        int[] numbers = {3, 1, 5, 0, 2, 4, 6, 8, 7};


        for (int i = 0; i < numbers.length; i++) {
            tree.insert(numbers[i]);
        }

        System.out.println(tree.findPath(4));

    }
}
