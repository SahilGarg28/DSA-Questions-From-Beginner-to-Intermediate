// https://leetcode.com/problems/long-pressed-name/description/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char []charName=name.toCharArray();
        char []charTyped=typed.toCharArray();

        if(charName[0]!=charTyped[0]||charName.length>charTyped.length)
        return false;
        int i=0,j=0;
        for(;i<charTyped.length;i++){  
            if(charName[j]!=charTyped[i]&&charTyped[i-1]!=charTyped[i]){
                return false;
            }
            if(charName[j]==charTyped[i]){
                if(j<charName.length-1)
                j++;
            }
        }
        return charName[j]==charTyped[i-1];
    }
}