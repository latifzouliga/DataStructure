package review;

import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class BTree {

    Node root;

    void inset(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
            if (value <= current.value) {
                if (current.left == null) {
                    current.left = node;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = node;
                    return;
                }
                current = current.right;
            }
        }
    }

    // Depth First
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public void levelOrder(Node root) {

        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node toVisit = queue.poll();
            if (toVisit.left != null) queue.add(toVisit.left);
            if (toVisit.right != null) queue.add(toVisit.right);
            System.out.print(toVisit.value + " ");
        }
        System.out.println();

    }

    public Node maxLeftNode(Node root){
        if (root == null ){
            return null;
        }


        if (!isLeaf(root)){
            return maxLeftNode(root.left);
        }
        return root;
    }

    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
}
