/*
 * PROBLEM:
 * Find the sum of digits of a number using recursion.
 *
 * Example:
 * Input: 1234
 * Output: 10
 *
 * Explanation:
 * 1 + 2 + 3 + 4 = 10
 *
 * APPROACH:
 * Break the number into two parts:
 * 1. Last digit (n % 10)
 * 2. Remaining number (n / 10)
 *
 * Recursive relation:
 * sum(n) = (n % 10) + sum(n / 10)
 *
 * Base Case:
 * When n == 0 return 0
 *
 * TIME COMPLEXITY:
 * O(d) where d = number of digits
 *
 * SPACE COMPLEXITY:
 * O(d) due to recursion stack
 */

public class SumOfDigitsRecursion {

    public static int sumOfDigits(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {

        int number = 1234;

        int result = sumOfDigits(number);

        System.out.println("Sum of digits of " + number + " is: " + result);
    }
}
