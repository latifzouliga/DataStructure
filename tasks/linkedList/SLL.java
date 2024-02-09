package linkedList;

import org.w3c.dom.Node;

public class SLL {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void insert(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
            size++;
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }



    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


}
