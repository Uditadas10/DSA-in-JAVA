/*
PROBLEM:
Given the head of a linked list, remove the nth node from the end of the list
and return its head.

APPROACH:
1. If the list contains only one node, return null.
2. Traverse the linked list once to calculate its size.
3. If n is equal to the size of the list, it means we need to delete the first node.
   So return head.next.
4. Otherwise, find the node just before the node to be deleted.
5. Change its next pointer to skip the target node.
6. Return the updated head.

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)
*/

import java.util.*;;

public class removeNthFromEnd {
     static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        int i = 1;
        ListNode prev = head;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

        return head;
    }
}

