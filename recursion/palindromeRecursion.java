/*
 * PROBLEM:
 * Check whether a string is a palindrome using recursion.
 *
 * A palindrome is a string that reads the same forward and backward.
 *
 * Example:
 * Input: "madam"
 * Output: true
 *
 * APPROACH:
 * Compare the first and last characters.
 *
 * Steps:
 * 1. Base Case:
 *    If start index >= end index → string is palindrome.
 *
 * 2. If characters at start and end are not equal → not palindrome.
 *
 * 3. Recursively check the substring inside.
 *
 * TIME COMPLEXITY:
 * O(n)
 *
 * SPACE COMPLEXITY:
 * O(n) due to recursion stack
 */

public class palindromeRecursion {

    public static boolean isPalindrome(String str, int left, int right) {

        // Base case
        if (left >= right) {
            return true;
        }

        // Check characters
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        System.out.println("Is palindrome: " + result);
    }
}
