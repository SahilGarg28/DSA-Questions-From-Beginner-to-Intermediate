//https://leetcode.com/problems/first-missing-positive/
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            while(nums[i]>0&&nums[i]<=n&&nums[i]!=i+1)
            {
                if(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return nums.length+1;
    }
    
    public void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}