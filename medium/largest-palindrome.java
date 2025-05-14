// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Solution {
    public static void main(String[] args) {
         Solution solution = new Solution();
         System.out.println(solution.longestPalindrome("aahhagssahhattewaaa"));
    }
    public  String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0;  // To store the start index of the longest palindrome
        int maxLength = 1;  // Minimum length of palindrome is 1 (the character itself)
        // Helper function to expand around the center
        for (int i = 0; i < s.length(); i++) {
            // Expand around center for odd-length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Expand around center for even-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);
            // Get the maximum length of the two
            int len = Math.max(len1, len2);
            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;  // Update the start index of the palindrome
            }
        }
        return s.substring(start, start + maxLength);
    }
    // Helper function to expand around the center
    private  int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Length of the palindrome is right - left - 1 (because left and right move one step too far)
        return right - left - 1;
    }
}
