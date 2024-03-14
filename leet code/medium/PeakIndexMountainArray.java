// package leet code.medium;
//852. Peak Index in a Mountain Array
/**
 * PeakIndexMountainArray
 */
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=arr[0];
        int start=0;
        int end=arr.length-1;
        if(max>arr[1])
            return 0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[mid+1])
            {
                if(arr[mid]>=arr[mid-1])
                {
                    return mid;
                }
                else
                {
                    end=mid-1;
                }
            }
            else{
                start=mid+1;
            }
        
        }
        return -1;
    }
}