// https://leetcode.com/problems/reverse-prefix-of-word/description/
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] charArr=word.toCharArray();
        int i=word.indexOf(ch);
        int low=0,high=i;
        while(low<high){
            char temp=charArr[low];
            charArr[low]=charArr[high];
            charArr[high]=temp;
            low++;
            high--;
        }
        return new String(charArr);
    }
}