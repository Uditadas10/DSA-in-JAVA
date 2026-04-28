/*
PROBLEM:
Sort an array using the Selection Sort algorithm.

INPUT:
[9, 4, 6, 3, 8, 5]

OUTPUT:
3 4 5 6 8 9

APPROACH:
1. Divide the array into two parts:
   - Sorted part
   - Unsorted part
2. Find the smallest element in the unsorted part.
3. Swap it with the first element of the unsorted part.
4. Move the boundary of the sorted part forward.
5. Repeat until the array is sorted.

TIME COMPLEXITY:
Best Case: O(n^2)
Average Case: O(n^2)
Worst Case: O(n^2)

SPACE COMPLEXITY:
O(1) (in-place sorting)
*/

public class SelectionSort {

    public static void selectionSort(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }

            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }
    }

    public static void main(String[] args) {

        int nums[] = {9, 4, 6, 3, 8, 5};

        selectionSort(nums);

        System.out.println("Sorted Array:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
