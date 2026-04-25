import java.util.Stack;

/*
PROBLEM:
Push an element at the bottom of a stack using recursion.

APPROACH:
1. If the stack is empty, push the given data.
2. Otherwise, remove the top element.
3. Recursively call pushAtBottom().
4. After inserting data at bottom, push the removed elements back.

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(n) because of recursion stack.
*/

class solution{

    public static void pushAtBottom(int data, Stack<Integer> s) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        pushAtBottom(6, s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}


