/*
PROBLEM: Find kth largest element
APPROACH:
START
1.sort(nums)
2.n ← length(nums)
3.return nums[n-k]
END
*/


import java.util.Arrays;
class Solution {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
       int kth_largest_element=nums[n-k];
       return kth_largest_element;
    }
    public static void main(String args[]){
        int nums[]={2,6,4,7,2,6,1,9};
        findKthLargest(nums,3);
    }
}
