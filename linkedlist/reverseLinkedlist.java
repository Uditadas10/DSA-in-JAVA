/*
PROBLEM:
Reverse a singly linked list.

APPROACH:
Two approaches are implemented:

1. Iterative Method
   - Use three pointers: prev, curr, and nextnode.
   - Traverse the list and reverse the direction of links.

2. Recursive Method
   - Recursively reverse the rest of the list.
   - Fix the current node's link while returning.

TIME COMPLEXITY:
Iterative Reverse  -> O(n)
Recursive Reverse  -> O(n)

SPACE COMPLEXITY:
Iterative Reverse  -> O(1)
Recursive Reverse  -> O(n) (due to recursion stack)
*/
import java.util.*;
class reverseLinkedlist {

    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /*
    ALGORITHM: reverseIterate()

    1. Initialize three pointers:
       prev = null
       curr = head

    2. Traverse the linked list while curr is not null.
       a. Store next node.
       b. Reverse the link of current node.
       c. Move prev and curr forward.

    3. After traversal, set head = prev.
    */

    public void reverseIterate() {
        if (head == null) {
            return;
        }

        node prev = null;
        node curr = head;

        while (curr != null) {
            node nextnode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextnode;
        }

        head = prev;
    }

    /*
    ALGORITHM: reverseRecursion(node head)

    1. If the list is empty or contains only one node,
       return head.

    2. Recursively reverse the rest of the list.

    3. Fix the current node:
       head.next.next = head

    4. Set head.next = null to avoid cycle.

    5. Return new head of the reversed list.
    */

    public node reverseRecursion(node head) {

        if (head == null || head.next == null) {
            return head;
        }

        node newhead = reverseRecursion(head.next);

        head.next.next = head;
        head.next = null;

        return newhead;
    }
}

