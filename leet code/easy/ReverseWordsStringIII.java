// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
class Solution {
    public String reverseWords(String s) {
        String []sArray=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String str:sArray)
        {
            char[] strArr=str.toCharArray();
            int low=0,high=strArr.length-1;
            while(low<high){
                char temp=strArr[low];
                strArr[low]=strArr[high];
                strArr[high]=temp;
                low++;
                high--;
            }
            sb.append(new String(strArr));
            sb.append(" ");

        }
        return sb.toString().trim();

    }
}