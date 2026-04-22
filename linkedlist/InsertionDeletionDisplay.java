import java.util.*;

/*
TIME COMPLEXITY:
1. addFirst(int data)   -> O(1)
2. addLast(int data)    -> O(n)
3. deleteFirst()        -> O(1)
4. deleteLast()         -> O(n)
5. display()            -> O(n)

SPACE COMPLEXITY:
1. addFirst(int data)   -> O(1)
2. addLast(int data)    -> O(1)
3. deleteFirst()        -> O(1)
4. deleteLast()         -> O(1)
5. display()            -> O(1)

OVERALL IDEA:
This program performs insertion, deletion, and display operations in a singly linked list.
*/

class InsertionDeletionDisplay {
    node head = null; 

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /*
    ALGORITHM: addFirst(int data)
    1. Create a new node with the given data.
    2. If the linked list is empty, make the new node the head.
    3. Otherwise, point the new node to the current head.
    4. Move head to the new node.
    */

    public void addFirst(int data) {
        node newnode = new node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    /*
    ALGORITHM: addLast(int data)
    1. Create a new node with the given data.
    2. If the linked list is empty, make the new node the head.
    3. Otherwise, start from the head.
    4. Traverse the list until the last node is reached.
    5. Attach the new node at the end.
    */

    public void addLast(int data) {
        node newnode = new node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    /*
    ALGORITHM: deleteFirst()
    1. Check if the linked list is empty.
    2. If empty, return without doing anything.
    3. Otherwise, move head to the next node.
    4. The first node gets removed automatically.
    */

    public void deleteFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    /*
    ALGORITHM: deleteLast()
    1. Check if the linked list is empty.
    2. If empty, return.
    3. If only one node is present, make head null.
    4. Otherwise, take two pointers: temp and prev.
    5. Traverse until temp reaches the last node.
    6. Make prev.next = null to remove the last node.
    */

    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        node temp = head;
        node prev = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
    }

    /*
    ALGORITHM: display()
    1. Start from the head node.
    2. Traverse the linked list until temp becomes null.
    3. Print each node's data.
    4. Move temp to the next node in each step.
    */

    public void display() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        InsertionDeletionDisplay list = new InsertionDeletionDisplay();

        list.addFirst(7);
        list.addFirst(9);
        list.addLast(4);
        list.addLast(1);
        list.addLast(3);
        list.addFirst(6);
        list.addFirst(5);

        list.deleteFirst();
        list.deleteLast();

        list.display();
    }
}