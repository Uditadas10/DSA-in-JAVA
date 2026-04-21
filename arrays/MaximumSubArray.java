
    /*
    PROBLEM:
    Given an integer array nums, find the contiguous subarray
    with the largest sum and return that sum.

    Example:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum = 6.

    APPROACH:
    Use Kadane's Algorithm.

    1. Initialize two variables:
       currentSum = nums[0]
       maxSum = nums[0]

    2. Traverse the array from index 1.

    3. For each element:
       - Either start a new subarray from nums[i]
       - Or extend the previous subarray

       currentSum = max(nums[i], currentSum + nums[i])

    4. Update the maximum sum:
       maxSum = max(maxSum, currentSum)

    5. Return maxSum.

    Time Complexity: O(n)
    Space Complexity: O(1)
    */
class Solution{
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}