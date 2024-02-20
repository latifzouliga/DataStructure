package trees.oracle;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    Node root;

    boolean isEmpty() {
        return root == null;
    }

    void insert(int value) {
        Node node = new Node(value);

        if (isEmpty()) root = node;

        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = node;
                }
                current = current.left;
            } else if (value > current.value) {
                if (current.right == null) {
                    current.right = node;
                }
                current = current.right;
            } else {
                break;
            }
        }
    }

    List<Integer> findPath(int value) {
        List<Integer> list = new ArrayList<>();
        if (isEmpty()) {
            return List.of();
        }

        Node current = root;
        while (current != null) {
            if (value < current.value) {
                list.add(current.value);
                current = current.left;
            } else if (value > current.value) {
                list.add(current.value);
                current = current.right;
            } else {
                list.add(current.value);
                return list;
            }
        }
        return List.of();
    }
}











