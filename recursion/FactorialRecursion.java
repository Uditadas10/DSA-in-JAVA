/*
 * PROBLEM:
 * Calculate the factorial of a number using recursion.
 *
 * Factorial of n (n!) is defined as:
 * n! = n × (n-1) × (n-2) × ... × 1
 *
 * Example:
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * APPROACH:
 * Recursion means a function calling itself.
 *
 * Steps:
 * 1. Define the base case:
 *    factorial(0) = 1
 *    factorial(1) = 1
 *
 * 2. Recursive case:
 *    factorial(n) = n × factorial(n - 1)
 *
 * 3. The function keeps calling itself until it reaches the base case.
 *
 * TIME COMPLEXITY:
 * O(n)
 *
 * SPACE COMPLEXITY:
 * O(n) (due to recursive call stack)
 */

public class FactorialRecursion {

    public static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        int result = factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}