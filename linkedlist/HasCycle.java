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

