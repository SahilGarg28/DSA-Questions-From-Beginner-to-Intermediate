// https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        String[] sub=s.split(" ");
        return sub[sub.length-1].length();
    }
}