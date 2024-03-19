//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=i+1&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1])
            {
                swap(nums,i,nums[i]-1);
            }
        }
        
        
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}