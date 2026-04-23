    /*
PROBLEM:
Given the head of a singly linked list, determine whether the linked list is a palindrome.

APPROACH:
1. If the list is empty or has only one node, it is a palindrome.
2. Find the middle of the linked list using slow and fast pointers.
3. Reverse the second half of the linked list.
4. Compare the first half and reversed second half node by node.
5. If all nodes match, the linked list is a palindrome.

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;
class PalindromLinkedList {
    class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    
    public ListNode findMiddle(ListNode head) {

        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode middle = findMiddle(head);

        ListNode secondHalfStart = reverse(middle.next);
        ListNode firstHalfStart = head;

        while (secondHalfStart != null) {

            if (firstHalfStart.val != secondHalfStart.val) {
                return false;
            }

            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }
}
