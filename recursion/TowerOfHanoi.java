/*
 * PROBLEM:
 * Solve Tower of Hanoi using recursion.
 *
 * APPROACH:
 * Tower of Hanoi has three rods:
 * 1. Source
 * 2. Helper
 * 3. Destination
 *
 * Rules:
 * 1. Move only one disk at a time.
 * 2. A larger disk cannot be placed on a smaller disk.
 *
 * Steps:
 * 1. Move n-1 disks from Source to Helper.
 * 2. Move the nth disk from Source to Destination.
 * 3. Move n-1 disks from Helper to Destination.
 *
 * TIME COMPLEXITY:
 * O(2^n)
 *
 * SPACE COMPLEXITY:
 * O(n) due to recursive call stack
 */

public class TowerOfHanoi {

    public static void solveTowerOfHanoi(int n, char source, char helper, char destination) {

        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to helper
        solveTowerOfHanoi(n - 1, source, destination, helper);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from helper to destination
        solveTowerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {

        int disks = 3;

        System.out.println("Tower of Hanoi steps for " + disks + " disks:");

        solveTowerOfHanoi(disks, 'A', 'B', 'C');
    }
}
