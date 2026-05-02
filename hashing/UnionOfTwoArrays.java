/*
 * PROBLEM:
 * Find the union of two arrays and count the total number of unique elements.
 *
 * APPROACH:
 * 1. Create a HashSet to store unique elements.
 * 2. Insert all elements of the first array into the set.
 * 3. Insert all elements of the second array into the set.
 * 4. Since HashSet stores only unique values, duplicates are automatically removed.
 * 5. Print the union elements and return the size of the set.
 *
 * TIME COMPLEXITY: O(n + m)
 * where n = length of first array, m = length of second array
 *
 * SPACE COMPLEXITY: O(n + m)
 * because HashSet may store all unique elements from both arrays
 */

import java.util.HashSet;

public class UnionOfTwoArrays {

    public static int findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int value : arr1) {
            set.add(value);
        }

        for (int value : arr2) {
            set.add(value);
        }

        System.out.print("Union elements are: ");
        for (int value : set) {
            System.out.print(value + " ");
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 8, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        int totalUniqueElements = findUnion(arr1, arr2);

        System.out.println("\nTotal unique elements: " + totalUniqueElements);
    }
}