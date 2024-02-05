package SinglyLinkedList;

public class LinkedListUtils {


    public static Node merge2List(Node head1, Node head2){
        if (head1 == null){
            return head2;
        }
        if (head2 == null){
            return head1;
        }

        Node current = head1;
        while (current.next != null){
            current = current.next;
        }

        current.next = head2;
        return head1;
    }

    //TODO: REVERSE LINKEDLIST AND REMOVE DUPLICATES





}













