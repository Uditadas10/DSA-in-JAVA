/*
 * PROBLEM:
 * Calculate the power of a number using recursion.
 *
 * Example:
 * Input: x = 2, n = 5
 * Output: 32
 *
 * Explanation:
 * 2^5 = 2 × 2 × 2 × 2 × 2 = 32
 *
 * APPROACH:
 * Use recursion based on the mathematical definition:
 *
 * power(x, n) = x * power(x, n - 1)
 *
 * Base Case:
 * If n == 0 → return 1
 *
 * TIME COMPLEXITY:
 * O(n)
 *
 * SPACE COMPLEXITY:
 * O(n) due to recursion stack
 */

public class PowerOfNumber {

    public static int power(int x, int n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {

        int base = 2;
        int exponent = 5;

        int result = power(base, exponent);

        System.out.println(base + "^" + exponent + " = " + result);
    }
}