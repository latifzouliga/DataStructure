public class TreeApp {
    public static void main(String[] args) {

        MyTree tree = new MyTree();

        //int[] numbers = {10, 5, 12, 3, 6, 11, 13, 2,};
        //int[] numbers = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        int[] numbers = {15, 18, 11, 7,4};

        for (int i = 0; i < 5; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root, null, false);

//        System.out.println("Pr order");
//        tree.preOrderTraversal(tree.root);
//
//        System.out.println("In order");
//        tree.inOrderTraversal(tree.root);
//
//        System.out.println("post order");
//        tree.postOrderTraversal(tree.root);
//
//        System.out.println("Level Order");
//        tree.levelOrderTraversal(tree.root);
//
//        System.out.println("print leaves");
//        tree.printLeaves(tree.root);
//
//        System.out.println("print leaves recursively");
//        tree.printLeavesRecursiveInOrder(tree.root);
//
//        System.out.println("contains: "+tree.contains(111));
//
//        VisualizeTree.printTree(tree.root, null, false);
//
//        System.out.println("tree leaves are = " + tree.isLeaf(10));
//
//        System.out.println("Total leaves are = " + tree.countLeaves(tree.root));
//
//        System.out.println("Total leaves counted recur are = " +tree.countLeavesRecur(tree.root) );
//
//        System.out.println("Sum leaves values: "+ tree.sumLeafValues(tree.root));
//
//        System.out.println("the height of the tree is: "+ tree.height(tree.root));

//        System.out.println("Balance factor is: " + tree.balanceFactor(tree.root));

//         System.out.println("Sum of node Depths is: " + tree.depthOfNodes(tree.root, 0));

        System.out.println("Sum of node values is : "+ tree.sumOfNodes(tree.root, 0));



    }
}
