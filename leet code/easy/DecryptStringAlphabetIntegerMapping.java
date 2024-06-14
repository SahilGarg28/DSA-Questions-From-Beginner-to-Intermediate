// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/

// Method 1
class Solution {
    public String freqAlphabets(String s) {
        String []charstr=s.split("");
        String ans="";
        System.out.println(Arrays.toString(charstr));
        for(int i=0;i<charstr.length;){
            if(i+2<charstr.length&&charstr[i+2].equals("#"))
            {
               int num = Integer.parseInt(charstr[i] + charstr[i + 1]);
                ans = ans + (char) ('a' + num - 1);
                i = i + 3;
            }
            else
            {
                int num = Integer.parseInt(charstr[i]);
                ans = ans + (char) ('a' + num - 1);
                i = i + 1;
            }
        }
        return ans;
    }
}