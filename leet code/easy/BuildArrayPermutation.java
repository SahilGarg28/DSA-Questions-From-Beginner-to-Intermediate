// package leet code.easy;
//https://leetcode.com/problems/build-array-from-permutation/
class Solution {
    public int[] buildArray(int[] nums) {
        int []ans=new int[nums.length];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}