//https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        if(max<gain[0])
        {
            max=gain[0];
        }
        for(int i=1;i<gain.length;i++){
            gain[i]=gain[i-1]+gain[i];
            if(max<gain[i])
            {
                max=gain[i];
            }
        }
        return max;
    }
}