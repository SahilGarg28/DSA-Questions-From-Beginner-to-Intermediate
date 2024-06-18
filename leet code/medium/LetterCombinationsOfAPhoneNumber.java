// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.ArrayList;
import java.util.List;

    class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals(""))
        {
            return new ArrayList<>();
        }
        return pad("",digits);
    }
    List<String> pad(String p,String up){
        List<String> list=new ArrayList<>();
        if(up.equals("")){
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        int start=(digit-2)*3,end=start+2;
        if(digit==7)
        {
            end++;
        }
        if(digit==8)
        {
            start++;
            end++;
        }
        if(digit==9)
        {
            start++;
            end+=2;
        }
        for(int i=start;i<end+1;i++){
            char ch=(char)('a'+i);
            list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }
}

