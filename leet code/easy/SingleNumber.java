//https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=nums[i]^ans;
        }
        return ans;
    }
}