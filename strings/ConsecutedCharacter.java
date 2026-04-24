/*
PROBLEM:
Given a string s, return the maximum number of consecutive identical characters.

Example:
Input:  "abbcccddddeeeeedcba"
Output: 5
Explanation:
The character 'e' appears consecutively 5 times.

APPROACH:
1. Initialize two variables:
   - count = 1 (to track current consecutive characters)
   - max = 1 (to store maximum consecutive count)

2. Traverse the string from index 1 to n-1.

3. If current character equals previous character:
      increase count.

4. Update max with the maximum value between max and count.

5. If characters differ:
      reset count to 1.

6. Return max.

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)
*/

class ConsectiveCharacters {

    public static int maxPower(String s) {

        int max = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "abbcccddddeeeeedcba";

        int result = maxPower(s);

        System.out.println("Maximum consecutive characters: " + result);
    }
}

