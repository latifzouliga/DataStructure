package linkedList;

public class MergeTwoSortedSLL {


    // ListNode
    public static class ListNode {
        int value;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int value) {
            this.value = value;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode();
        ListNode prev = dummyHead;

        while (list1 != null && list2 != null) {

            if (list1.value <= list2.value) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        if (list1 == null) {
            prev.next = list2;
        } else {
            prev.next = list1;
        }
        return dummyHead.next;

    }

    // =========================== SinglyLinkedList ==============================
    public static SLL.Node mergeTwoSortedSLL(SLL.Node head1, SLL.Node head2) {

        SLL.Node dummyHead = new SLL.Node(0);
        SLL.Node prev = dummyHead;
        SLL.Node curr1 = head1;
        SLL.Node curr2 = head2;

        while (curr1 != null && curr2 != null) {

            if (curr1.value <= curr2.value) {
                prev.next = curr1;
                curr1 = curr1.next;
            } else {
                prev.next = curr2;
                curr2 = curr2.next;
            }
            prev = prev.next;
        }

        if (curr1 == null) {
            prev.next = curr2;
        } else {
            prev.next = curr1;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {

        // ListNode
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;


        ListNode node11 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        ListNode node33 = new ListNode(5);
        node11.next = node22;
        node22.next = node33;

        ListNode current = mergeTwoLists(node1, node11);

        while (current != null) {
            System.out.print(current.value + " => ");
            current = current.next;
        }
        System.out.println("null");


        // =========================== SinglyLinkedList ==============================
        SLL sll1 = new SLL();
        sll1.insert(1);
        sll1.insert(2);
        sll1.insert(4);

        SLL sll2 = new SLL();
        sll2.insert(1);
        sll2.insert(3);
        sll2.insert(5);

        SLL.Node cur = mergeTwoSortedSLL(sll1.head, sll2.head);

        while (cur != null) {
            System.out.print(cur.value + " => ");
            cur = cur.next;
        }
        System.out.println("null");
    }


}
