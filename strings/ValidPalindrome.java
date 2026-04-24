 /*
PROBLEM:
Determine whether a given string is a valid palindrome.

A string is considered a palindrome if, after ignoring non-alphanumeric
characters and converting all letters to lowercase, it reads the same
forward and backward.

EXAMPLE:
Input:  "A man, a plan, a canal: Panama"
Output: true

APPROACH:
1. Use two pointers:
   - i starting from the beginning
   - j starting from the end

2. Skip characters that are not letters or digits.

3. Compare characters after converting them to lowercase.

4. If characters do not match → return false.

5. Move both pointers towards the center.

6. If the loop finishes without mismatch → return true.

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)
*/

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
} 
    

