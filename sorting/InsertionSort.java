/*
PROBLEM:
Sort an array using the Insertion Sort algorithm.

INPUT:
[9, 4, 6, 3, 8, 5]

OUTPUT:
3 4 5 6 8 9

APPROACH:
1. Start from the second element of the array.
2. Compare the current element with the previous elements.
3. Shift all larger elements one position to the right.
4. Insert the current element in its correct position.
5. Repeat until the entire array is sorted.

TIME COMPLEXITY:
Best Case: O(n)        (when the array is already sorted)
Average Case: O(n^2)
Worst Case: O(n^2)

SPACE COMPLEXITY:
O(1) (in-place sorting)
*/

public class InsertionSort {

    public static void insertionSort(int[] nums) {

        int n = nums.length;

        for (int i = 1; i < n; i++) {

            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {

                nums[j + 1] = nums[j];
                j--;

            }

            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int nums[] = {9, 4, 6, 3, 8, 5};

        insertionSort(nums);

        System.out.println("Sorted Array:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
    

