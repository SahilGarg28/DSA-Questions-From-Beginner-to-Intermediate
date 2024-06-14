// https://leetcode.com/problems/robot-return-to-origin/description/
class Solution {
    public boolean judgeCircle(String moves) {
        char[] movesArray=moves.toCharArray();
        int netmovex=0;
        int netmovey=0;
        for(char move:movesArray){
            if(move=='U')
            {
                netmovey++;
            }
            else if(move=='D')
            {
                netmovey--;
            }
            else if(move=='L')
            {
                netmovex--;
            }
            else if(move=='R')
            {
                netmovex++;
            }
        }
        return netmovex==0&&netmovey==0?true:false;
    }
}