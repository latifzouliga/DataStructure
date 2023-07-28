public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // adding data to list
        Node node = new Node(data);

        // creating link and increasing the size
        if (isEmpty()) {
            head = tail = node;
            //head = node;
            //tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void deleteNodeById(int value) {

        // check if the list is empty
        if (isEmpty()) {
            System.out.println("list is empty");

        }

        // assign  prev and current with head
        Node prev = head;
        Node current = head;

        while (current != null) {
            if (current.id == value) {

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
            prev = current;
            current = current.next;
        }
    }

    void printNodes() {
        Node current = head;
        while (current != null) {

            if (current.next == null) System.out.println(current.id + " => null");
            else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }

    }
}
