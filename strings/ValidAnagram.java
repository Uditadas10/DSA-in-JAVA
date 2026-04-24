/*
PROBLEM:
Given two strings s and t, determine if t is an anagram of s.

An anagram is a word or phrase formed by rearranging the letters
of another word using all the original letters exactly once.

Example:
Input:  s = "anagram", t = "nagaram"
Output: true

APPROACH:
1. If the lengths of the strings are different, they cannot be anagrams.
2. Create an integer array of size 26 (for lowercase English letters).
3. Traverse both strings simultaneously.
4. Increase the count for characters in s and decrease for characters in t.
5. After traversal, check if all counts are zero.
6. If any count is non-zero → not an anagram.

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)
*/

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int charcount[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charcount[s.charAt(i) - 'a']++;
            charcount[t.charAt(i) - 'a']--;
        }

        for (int count : charcount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        if (result) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}

