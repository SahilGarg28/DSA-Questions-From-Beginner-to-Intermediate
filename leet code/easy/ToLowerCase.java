// https://leetcode.com/problems/to-lower-case/description/
// Method 1
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
// Method 2 (More Efficient)

class Solution {
    public String toLowerCase(String s) {
        char[] sArray=s.toCharArray();
        for(int i=0;i<sArray.length;i++){
            char ch =sArray[i];
            if(ch>='A'&&ch<='Z')
            {
                sArray[i]+=32;
            }
        }
        return new String(sArray);
    }
}