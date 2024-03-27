//https://leetcode.com/problems/subarray-product-less-than-k/
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<k)
            {
                count++;
                int mult=nums[i];
                for(int j=i+1;j<nums.length;j++)
                {
                    mult=mult*nums[j];
                    if(mult<k)
                    {
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return count;
    }
}