import java.util.*;

public class MyTree {

    TNode root;

    public MyTree() {
    }

    public void insert(int value) {
        TNode newNode = new TNode(value);

        if (root == null) {
            root = newNode;
            return;
        }
        // iterating the tree
        TNode current = root;
        while (true) {
            if (value <= current.value) {
                // if the leftChild is null then branch to the left
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild; // jump to the next node
            } else {
                // if rightChild is null branch into the right
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild; // jump to the next node
            }
        }

    }


    //==================================== Depth first ===============================
    // PreOrder Traversal of the tree
    // Root -> Left -> Right
    public void preOrderTraversal(TNode root) {

        if (root == null) return;
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    // In-Order Traversal
    // Left -> Root -> Right
    public void inOrderTraversal(TNode root) {

        if (root == null) return;

        inOrderTraversal(root.leftChild);
        System.out.println(root.value);
        inOrderTraversal(root.rightChild);
    }


    // Post-Order Traversal - In Depth
    // Left -> Right -> Root ==> needs to finish all sub-trees before visiting the root
    public void postOrderTraversal(TNode root) {
        if (root == null) return;

        postOrderTraversal(root.leftChild);  // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.println(root.value);      // visit root

    }

    // ==================================== Breadth First (Level Order) ===========================
    // the logic is visiting the tree level by level starting from the root and from left to right level  by level

    public void levelOrderTraversal(TNode root) {
        if (root == null) return;                   // termination
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            //if (toVisit.leftChild == null)  System.out.println(toVisit.value); print leaves only
            System.out.println(toVisit.value);
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }

    }


    //TODO: TASKS FROM "Trees_Review Class Notes" PDF
    // =================== tasks ====================

    // print the leaves of a tree
    public void printLeaves(TNode root) {
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            if (toVisit.leftChild == null && toVisit.rightChild == null) System.out.println(toVisit.value);
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);

        }

    }


    public void printLeavesRecursiveInOrder(TNode root) {
        if (root == null) return;

        printLeavesRecursiveInOrder(root.leftChild);
        //if (root.leftChild == null && root.rightChild == null) System.out.println(root.value);
        if (isLeafNode(root)) System.out.println(root.value);
        printLeavesRecursiveInOrder(root.rightChild);
    }


    // Task 1: Implement finding an integer value in a BST (Binary Search Tree)

    /**
     * public boolean contains(int value) {
     * if (root == null) return false;
     * <p>
     * Queue<TNode> queue = new LinkedList<>();
     * queue.add(root);
     * <p>
     * while (!queue.isEmpty()) {
     * TNode toVisit = queue.poll();
     * if (toVisit.value == value) {
     * return true;
     * }
     * if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
     * if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
     * }
     * return false;
     * }
     */
    public boolean contains(int value) {
        if (root == null) return false;

        TNode current = root;
        while (current != null) {
            if (value < current.value) current = current.leftChild;
            else if (value > current.value) current = current.rightChild;
            else return true;
        }
        return false;
    }


    // Task 2: Implement a method that returns true if the value of node is a leaf in BST
    public boolean isLeafValue(int value) {
        if (root == null) return false;

        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();

            if (value == toVisit.value) {
                if (toVisit.leftChild == null && toVisit.rightChild == null) {
                    return true;
                }
            }
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
        return false;
    }

    // Task 2: Implement a method that returns true if the node is a leaf in BST
    public boolean isLeafNode(TNode node) {
        return node.leftChild == null && node.rightChild == null;
    }


    // Implement a method that counts the leaves
    public int countLeaves(TNode root) {

        int count = 0;
        if (root == null) return 0;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            if (toVisit.leftChild == null && toVisit.rightChild == null) {
                count++;
            }
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
        return count;
    }

    public int countLeavesRecur(TNode root) {
        if (root == null) return 0;
        if (isLeafNode(root)) return 1;
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

    // implement a method that returns the sum of leaf values
    public int sumLeafValues(TNode root) {
        if (root == null) return 0;
        if (isLeafNode(root)) return root.value;
        return sumLeafValues(root.leftChild) + sumLeafValues(root.rightChild);
    }

    // the height of tree can be calculated by calculating the edges instead of nodes

    // implement a method that returns the height of node in tree
    public int height(TNode root) {
        // in the root has no children it will return 0. because the height is 0
        // if the root is null it will return -1.
        if (root == null) return -1;
        if (isLeafNode(root)) return 0;

        // since the leaf nodes return -1 and the root node with no children return 0 we need to add 1 to handle the edge case
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int balanceFactor(TNode root) {
        if (root == null) return -1;
        if (isLeafNode(root)) return 0;
        return Math.abs(balanceFactor(root.leftChild) - balanceFactor(root.rightChild));
    }


    // a of node depth
    public int depthOfNodes(TNode root, int a) {

        if (root == null) return 0;
        //System.out.println(root.value);
        return a + (depthOfNodes(root.leftChild, a + 1)) + (depthOfNodes(root.rightChild, a + 1));
    }


    // find the node values
    //TODO: something is wrong
    public int sumOfNodes(TNode node, int sum) {
        if (node == null) return 0;
        return sum + sumOfNodes(node.leftChild,  node.value) + sumOfNodes(node.rightChild,  node.value);
    }





}


















