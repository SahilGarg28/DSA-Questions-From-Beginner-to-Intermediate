// https://leetcode.com/problems/power-of-four/submissions/
class Solution {
    public boolean isPowerOfFour(int n) {
        while(n%4==0){
            n=n/4;
            if(n==0)
                return false;
        }
        if(n==1)
        return true;
        return false;
    }
}