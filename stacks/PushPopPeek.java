import java.util.*;
/*
PROBLEM:
Implement Stack using Linked List.

APPROACH:
1. Create a Node class containing:
   - data
   - next pointer

2. Maintain a head pointer which represents the TOP of the stack.

3. Push Operation:
   - Create a new node.
   - Point newNode.next to head.
   - Update head to newNode.

4. Pop Operation:
   - Store head.data.
   - Move head to head.next.
   - Return the stored value.

5. Peek Operation:
   - Return head.data without removing it.

6. Display:
   - Traverse from head and print elements.

TIME COMPLEXITY:
Push  -> O(1)
Pop   -> O(1)
Peek  -> O(1)
Display -> O(n)

SPACE COMPLEXITY:
O(n)
*/


public class PushPopPeek {
  
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {

        Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.data;
        }

        public void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.print("Stack Elements: ");
        s.display();

        System.out.println("Popped Element: " + s.pop());

        System.out.print("After Pop: ");
        s.display();

        System.out.println("Top Element: " + s.peek());
    }
}

