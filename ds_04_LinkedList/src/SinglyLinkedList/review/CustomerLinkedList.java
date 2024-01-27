package SinglyLinkedList.review;

import java.util.Arrays;

public class CustomerLinkedList {

    CNode head;
    CNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void insertLast(CNode customer) {
        if (isEmpty()) {
            head = tail = customer;
        } else {
            tail.next = customer;
            tail = customer;
        }
        size++;
    }


    public void printNames() {
        CNode current = head;

        while (current != null) {
            System.out.print(current.name + " => ");
            current = current.next;
        }
        System.out.println("null");
    }

    void deleteByName(String name) {

        CNode current = head;
        CNode prev = head;

        while (current != null) {
            if (current.name.equals(name)) {
                if (current == head) {
                    if (head == tail) {
                        tail = null;
                    }
                    head = current.next;
                    current.next = null;

                } else if (current == tail) {
                    prev.next = null;
                    tail = prev;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
            }
            size--;
            prev = current;
            current = current.next;
        }
    }

    @Override
    public String toString() {
        CNode current = head;

        CNode[] cNodes = new CNode[size];
        int k = 0;
        while (current != null) {
            cNodes[k++] = current;
            current = current.next;
        }
        return Arrays.toString(cNodes);
    }


}
