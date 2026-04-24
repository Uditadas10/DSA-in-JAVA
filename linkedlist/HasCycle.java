/*
PROBLEM:
Detect whether a singly linked list contains a cycle.

A cycle exists if some node in the list can be reached again
by continuously following the next pointer.

APPROACH:
We use Floyd’s Cycle Detection Algorithm (Tortoise and Hare).

1. Initialize two pointers:
   - slow moves one step at a time
   - fast moves two steps at a time

2. Traverse the list:
   - If fast reaches null → no cycle
   - If fast and slow meet → cycle exists

3. Return true if pointers meet, otherwise false.

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)
*/

public class HasCycle {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow =head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                return true;
            }

        }
    return false;
    }
    public static void main(String args[]){
          HasCycle obj = new HasCycle();
         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head; 
        System.out.println(obj.hasCycle(head));
    }
}

