/*
 * PROBLEM:
 * Implement Quick Sort in Java.
 *
 * APPROACH:
 * Quick Sort is a divide-and-conquer sorting algorithm.
 *
 * Steps:
 * 1. Choose a pivot element.
 * 2. Partition the array so that:
 *    - elements smaller than pivot go to the left
 *    - elements greater than pivot go to the right
 * 3. Recursively apply Quick Sort on left and right parts.
 *
 * TIME COMPLEXITY:
 * Best Case: O(n log n)
 * Average Case: O(n log n)
 * Worst Case: O(n^2)
 *
 * SPACE COMPLEXITY:
 * O(log n) for recursive stack in average case
 */

import java.util.*;

public class quickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}