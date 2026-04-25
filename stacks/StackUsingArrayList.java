 import java.util.ArrayList;

/*
PROBLEM:
Implement Stack using ArrayList in Java.

APPROACH:
1. Use an ArrayList to store stack elements.
2. The last element of the ArrayList represents the TOP of the stack.

Operations:

Push:
- Add element at the end of the ArrayList.

Pop:
- Get the last element.
- Remove it from the ArrayList.

Peek:
- Return the last element without removing it.

Display:
- Traverse the ArrayList and print elements.

TIME COMPLEXITY:
Push  -> O(1)
Pop   -> O(1)
Peek  -> O(1)
Display -> O(n)

SPACE COMPLEXITY:
O(n)
*/

public class StackUsingArrayList {

    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
        return list.size() == 0;
    }

    public static void push(int data) {
        list.add(data);
    }

    public static int pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public static int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return list.get(list.size() - 1);
    }

    public static void display() {

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);

        System.out.print("Stack Elements: ");
        display();

        System.out.println("Popped Element: " + pop());

        System.out.print("After Pop: ");
        display();

        System.out.println("Top Element: " + peek());
    }
}   

