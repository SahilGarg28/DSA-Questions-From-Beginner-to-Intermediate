//https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            while(nums[i]!=i+1&&nums[i]<=n&&nums[i]!=nums[nums[i]-1])
            {
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                return nums[i];
            }
        }
        return 0;
        
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}