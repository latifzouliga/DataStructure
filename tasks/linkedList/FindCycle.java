package linkedList;

import java.util.HashSet;
import java.util.Set;

public class FindCycle {

    static public class LinkedNode {
        int value;
        LinkedNode next;

        public LinkedNode(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {


        // inserting elements
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(6);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(5);
        LinkedNode node5 = new LinkedNode(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;


        System.out.println(hasCycle(node1));

    }

    // checks if there is a cyclic in any node in the linked list
    public static boolean hasCycle(LinkedNode head) {
        Set<LinkedNode> set = new HashSet<>();
        LinkedNode current = head;
        while (current != null){

            if (set.contains(current)) {
                return true;
            }
            set.add(current);
            current = current.next;

        }
        return false;
    }



}

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.
• There is a cycle in a linked list if there is some node in the list that can be reached again by
continuously following the next pointer. Internally, pos is used to denote the index of the node
that tail's next pointer is connected to. Note that pos is not passed as a parameter. • Return true if there is a cycle
in the linked list. Otherwise, return false.


input head: [3, 2,0, -4], pos = 1
output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed)l
 */