import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree{

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


    // PreOrder Traversal of the tree
    // Root -> Left -> Right
    public void preOrderTraversal(TNode root) {

        if (root == null) return;
        System.out.println(root.value );
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    // In-Order Traversal
    // Left -> Root -> Right
    public void inOrderTraversal(TNode root){

        if (root == null) return;

        inOrderTraversal(root.leftChild);
        System.out.println(root.value);
        inOrderTraversal(root.rightChild);
    }



    //==================================== Depth first ===============================
    // Post-Order Traversal - In Depth
    // Left -> Right -> Root ==> needs to finish all sub-trees before visiting the root
    public void postOrderTraversal(TNode root){
        if (root == null) return;

        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value);

    }

    // ==================================== Breadth First (Level Order) ===========================
    // the logic is visiting the tree level by level starting from the root and from left to right level  by level

    public void levelOrderTraversal(TNode root){
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TNode toVisit = queue.poll();
            System.out.println(toVisit.value);
            if (toVisit.leftChild != null)queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null)queue.add(toVisit.rightChild);
        }

    }



}
