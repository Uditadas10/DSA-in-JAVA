/*
PROBLEM:
Sort an array using the Bubble Sort algorithm.

INPUT:
[9, 4, 6, 3, 8, 5]

OUTPUT:
3 4 5 6 8 9

APPROACH:
1. Traverse the array multiple times.
2. Compare adjacent elements.
3. If the current element is greater than the next element, swap them.
4. After each pass, the largest element moves to the end of the array.
5. Repeat until the array is sorted.

TIME COMPLEXITY:
Best Case: O(n)
Average Case: O(n^2)
Worst Case: O(n^2)

SPACE COMPLEXITY:
O(1) (in-place sorting)
*/

public class bubbleSort {

    public static void bubbleSort(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {

        int nums[] = {9, 4, 6, 3, 8, 5};

        bubbleSort(nums);

        System.out.println("Sorted Array:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}