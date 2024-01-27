public class LinkedListUtils {

    public static Node mergeLinkedLists(Node head1,Node head2){
        Node p1 = head1;
        Node p1Prev = null;
        Node p2 = head2;

        while (p1 != null && p2 != null){

            if (p1.value < p2.value){
                p1 = p1Prev;
                p1 = p1.next;
            }else {
                if (p1Prev != null){
                    p1Prev.next = p2;
                }
                p1Prev = p2;
                p2 = p2.next;
                p1Prev.next = p1;
            }
        }

        if (p1 == null){
            p1Prev.next = p2;
        }
        return head1.value < head1.value ? head1 : head2;
    }

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
}
