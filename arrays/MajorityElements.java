import java.util.*;
/*
PROBLEM:
LeetCode 169 - Majority Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n/2⌋ times.

You may assume that the majority element always exists in the array.

Example:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

APPROACH:
Use Boyer-Moore Voting Algorithm.

The idea is that the majority element occurs more than n/2 times,
so it will survive all pair cancellations.

ALGORITHM:
1. Initialize:
      candidate = 0
      count = 0

2. Traverse the array:
      a. If count == 0 → set candidate = current number
      b. If current number == candidate → increment count
      c. Otherwise → decrement count

3. After traversal, candidate will contain the majority element.

TIME COMPLEXITY:
O(n) — single traversal of array

SPACE COMPLEXITY:
O(1) — constant space
*/


public class MajorityElements {
    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for(int num : nums){

            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        int result = majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
} 

