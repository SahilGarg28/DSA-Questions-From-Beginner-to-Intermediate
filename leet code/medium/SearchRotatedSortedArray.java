//https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    public int search(int[] nums, int target) {
        int ans=-1;
        if(nums.length==1)
        {
            if(nums[0]==target)
                return 0;
            else
                return -1;
        }
        if(nums[0]<nums[nums.length-1])
        {
          return binarySearch(nums,target,0,nums.length-1);  
            
        }
        int pivot=pivot(nums);
        
        if(pivot!=-1)
        {
            ans=binarySearch(nums,target,0,pivot);
            if(ans==-1)
            {
                ans=binarySearch(nums,target,pivot+1,nums.length-1);
            }
        }
        else{
            ans=binarySearchDec(nums,target,0,nums.length-1);
        }
        return ans;
    }
    public int pivot(int []nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid!=end && nums[mid]>nums[mid+1])
                return mid;
            if(mid!=start && nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[start]>nums[mid])
                end=mid-1;
            if(nums[start]<nums[mid])
                start=mid;
        }
        return -1;
    }
    public int binarySearch(int []nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;}
            else if(target>nums[mid]){
                start=mid+1;}
            else{
                return mid;}
        }
        return -1;
    }
    public int binarySearchDec(int []nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                end=mid-1;}
            else if(target<nums[mid]){
                start=mid+1;}
            else{
                return mid;}
        }
        return -1;
    }
}
