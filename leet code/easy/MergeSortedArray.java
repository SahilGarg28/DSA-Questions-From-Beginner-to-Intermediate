// https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int []result=new int[m+n];
        while(i<m&&j<n){
            if(nums2[j]>nums1[i])
            {
                result[k]=nums1[i];
                i++;
            }
            else{
                result[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            result[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            result[k]=nums2[j];
            j++;
            k++;
        }
        for(int l=0;l<m+n;l++){
            nums1[l]=result[l];
        }
    }
}