package review;

public class BTreeTest {

    public static void main(String[] args) {

        BTree tree = new BTree();

        int[] nums = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int each : nums) {
            tree.inset(each);
        }

        VisualizeTree.printTree(tree.root,null,false);

        System.out.println("Pre Order");
        tree.preOrder(tree.root);


        System.out.println("\nIn Order");
        tree.inOrder(tree.root);

        System.out.println("\nPost order");
        tree.postOrder(tree.root);

        System.out.println("\nlevel order");
        tree.levelOrder(tree.root);

        System.out.println(tree.maxLeftNode(tree.root).value);
    }




}
