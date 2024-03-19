// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(!(sentence.length()>=26))
        {
            return false;
        }
        else{
            int[] alpha=new int[26];
            int count=0;
            for(int i=0;i<sentence.length();i++)
            {
                if(alpha[sentence.charAt(i)-97]==0){
                    alpha[sentence.charAt(i)-97]=1;
                    count++;
                    if(count==26)
                    {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}