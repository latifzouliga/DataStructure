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
        if (root.leftChild == null && root.rightChild == null) System.out.println(root.value);
        printLeavesRecursiveInOrder(root.rightChild);
    }

    // Task 1: Implement finding an integer value in a BST (Binary Search Tree)
    public boolean contains(int value) {
        if (root == null) return false;

        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            if (toVisit.value == value) {
                return true;
            }
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
        return false;
    }

    // Task 2: Implement a method that returns true if the node is a leaf in BST
    public boolean isLeaf(int value) {
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



}














