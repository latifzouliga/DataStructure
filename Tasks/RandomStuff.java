import java.util.*;

public class RandomStuff {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));

        remove(list, 2, 3);
        System.out.println(list);

    }


    public static void remove(LinkedList<Integer> list, int m, int n) {

        Iterator<Integer> it = list.iterator();

        Integer current = it.next();
        while (it.hasNext()) {
            int countM = 0;
            while (current != null && countM < m) {
                countM++;
                current = it.next();
            }

            int countN = 0;
            while (current != null && countN < n) {
                it.remove();
                if (!it.hasNext()) {
                    break;
                }
                current = it.next();
                countN++;
            }
        }

    }


}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

class Solution {

    public static ListNode remove(ListNode head, int m, int n) {

        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        List<Integer> remove = new ArrayList<>();

        while (current != null) {

// 1 => 2 => 3 => 4 => 5 => null

            for (int i = 0; i < m && current != null; i++) {
                list.add(current.value);
                current = current.next;
            }

            ListNode start = current;

            for (int i = 1; i <= n && current != null; i++) {
               current = current.next;
               //remove.add(current.value);
            }


            if (start != null)
                start.next = current;

        }
        System.out.println(list);
        System.out.println(remove);
        return head;

    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);
        ListNode node11 = new ListNode(11);
        ListNode node12 = new ListNode(12);
        ListNode node13 = new ListNode(13);

        node1.next = node2;
        node2.next = node3;
        node2.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;

        ListNode current = remove(node1, 2, 3);
        ;
        while (current != null) {
            System.out.print(current.value + " => ");
            current = current.next;
        }
        System.out.println("null");


    }
}







