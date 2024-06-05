// https://leetcode.com/problems/longest-palindrome/submissions/1277119279/

import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] stringArray = s.toCharArray();
        
        // Count the frequency of each character
        for (char c : stringArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int sum = 0;
        boolean hasOdd = false;
        
        // Calculate the length of the longest palindrome
        for (int count : map.values()) {
            if (count % 2 == 0) {
                sum += count;
            } else {
                sum += count - 1; // Add the even part of the count
                hasOdd = true; // There is at least one character with an odd count
            }
        }
        
        // Add one if there's any character with an odd count to place in the center
        if (hasOdd) {
            sum += 1;
        }
        
        return sum;
    }
}
