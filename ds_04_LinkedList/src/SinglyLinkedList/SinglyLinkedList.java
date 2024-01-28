package SinglyLinkedList;

import java.util.function.Consumer;

public class SinglyLinkedList {

    // TODO: Update this class
    Node head;
    Node tail;
    int size;

    Node prev;
    Node current;
    int index;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // adding data to list
        Node node = new Node(data);

        // creating link and increasing the size
        if (isEmpty()) {
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void addFirst(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    void addLast(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;

    }

    void deleteNodeByValue(int value) {

        // check if the list is empty
        if (isEmpty()) {
            System.out.println(" list is empty");

        }

        // assign  prev and current with head
        prev = head;
        current = head;

        while (current != null) {
            if (current.value == value) {

                // case 1: current is head
                if (current == head) {
                    head = current.next; // moving the head to next node
                    current.next = null; // head will be eligible for garbage collection
                }
                // case 2: current is tail
                else if (current == tail) {
                    tail = prev;
                    prev.next = null; // Ex - Tail will be eligible for garbage collection

                }
                // case 3: current is middle
                else {
                    prev.next = current.next;
                    current.next = null; // current will be eligible for garbage collection
                }

                // after deletion decrease the list size
                size--;

            }
            // iterate
            // move forward on the element of the list until the current is null
            prev = current;
            current = current.next;
        }
    }

    void printNodes() {

        if (size == 0) {
            System.out.println("[]");
        }
        current = head;
        System.out.print("[");
        while (current != null) {

            if (current.next == null) System.out.print(current.value + " ,null");
            else {
                System.out.print(current.value + " ,");
            }
            current = current.next;
        }
        System.out.println("]");

    }

    public void forEach(Consumer<Integer> consumer){

        Node current = head;

        while(current != null){
            consumer.accept(current.value);
            current = current.next;
        }

    }

    int indexOf(int element) {

        if (isEmpty()) return -1;

        current = head;
        index = 0;

        while (current != null) {
            if (current.value == element) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    int findByIndex(int index) {

        current = head;
        this.index = 0;

        while (current != null) {
            if (this.index == index) return current.value;
            this.index++;
            current = current.next;
        }
        return -1;
    }

    public int getKthFromLast(int k) {

        // Get the Kth item from the end of the linkedList
        // 1. linked list size is unknown
        // 2. find the Kth element from the end with on pass
        // 3. items already exists in the linked list
        // input: [1, 2,  3, 4]  k = 3
        // output: 2

        Node p1 = head;
        Node p2 = head;

        for (int i = 1; i < k; i++) {
            p2 = p2.next;
        }

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.value;
    }

    public void removeKthNode(int k) {

        if (k > size) {
            throw new RuntimeException(k + " is greater then the list size");
        }
        Node p1 = head;
        Node p2 = head;
        prev = head;

        for (int i = 1; i < k; i++) {
            p2 = p2.next;
        }

        while (p2.next != null) {
            prev = p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        if (p1 == head) {
            head = p1.next;
            p1.next = null;
            size--;
        } else if (p1 == tail) {
            tail = prev;
            prev.next = null;
            size--;
        } else {
            prev.next = p1.next;
            p1.next = null;
            size--;
        }
    }



}










