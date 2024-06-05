// https://leetcode.com/problems/shuffle-string/description/
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArray=s.toCharArray();
        char[] ans=new char[charArray.length];
        
        for(int i=0;i<indices.length;i++){
            ans[indices[i]]=charArray[i];
        }
        return new String(ans);
    }
}