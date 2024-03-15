// package leet code.hard;
//https://leetcode.com/problems/find-in-mountain-array/
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int max=findPeakElement(mountainArr);
        int ans=binarySearch(mountainArr,target,0,max);
        if(ans==-1)
        {
            ans=binarySearchDec(mountainArr,target,max+1,mountainArr.length()-1);
        }
        return ans;
        
    }
    public int findPeakElement(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            } else {
                start = mid + 1;

            }
        }
        return start;
    }
    public int binarySearch(MountainArray mountainArr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<mountainArr.get(mid)){
                end=mid-1;}
            else if(target>mountainArr.get(mid)){
                start=mid+1;}
            else{
                return mid;}
        }
        return -1;
    }
    public int binarySearchDec(MountainArray mountainArr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>mountainArr.get(mid)){
                end=mid-1;}
            else if(target<mountainArr.get(mid)){
                start=mid+1;}
            else{
                return mid;}
        }
        return -1;
    }
}