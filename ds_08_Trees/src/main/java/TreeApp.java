public class TreeApp {
    public static void main(String[] args) {

        MyTree tree = new MyTree();

        int[] numbers = {10, 5, 12, 3, 6, 11, 13, 2,};
        //int[] numbers = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i < 8; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("Pr order");
        tree.preOrderTraversal(tree.root);

        System.out.println("In order");
        tree.inOrderTraversal(tree.root);

        System.out.println("post order");
        tree.postOrderTraversal(tree.root);

        System.out.println("Level Order");
        tree.levelOrderTraversal(tree.root);

        System.out.println("print leaves");
        tree.printLeaves(tree.root);

        System.out.println("print leaves recursively");
        tree.printLeavesRecursiveInOrder(tree.root);

        System.out.println("contains: "+tree.contains(6));

        VisualizeTree.printTree(tree.root, null, false);
        System.out.println("tree.isLeaf(4) = " + tree.isLeaf(3));


    }
}
