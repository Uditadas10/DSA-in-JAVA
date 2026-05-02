/*
 * PROBLEM:
 * Reverse a string using recursion.
 *
 * Example:
 * Input: "hello"
 * Output: "olleh"
 *
 * APPROACH:
 * Recursion breaks the problem into smaller parts.
 *
 * Steps:
 * 1. Base Case:
 *    If the string is empty or has only one character, return it.
 *
 * 2. Recursive Case:
 *    Reverse the substring starting from index 1,
 *    then append the first character at the end.
 *
 * TIME COMPLEXITY:
 * O(n)
 *
 * SPACE COMPLEXITY:
 * O(n) due to recursion stack
 */

public class ReverseString{

    public static String reverse(String str) {

        // Base case
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String input = "hello";

        String result = reverse(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}