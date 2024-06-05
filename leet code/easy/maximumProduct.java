// https://leetcode.com/problems/maximum-product-of-three-numbers/submissions/

class Solution {
    public int maximumProduct(int[] nums) {
        int max1=-1000;int max2=-1000;int max3=-1000;int min1=Integer.MAX_VALUE;int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max3){
                max1=max2;
                max2=max3;
                max3=nums[i];
            }
            else if(nums[i]>max2){
                max1=max2;
                max2=nums[i];
            }
            else if(nums[i]>max1){
                max1=nums[i];
            }
            
            
            if(nums[i]<min2){
                min1=min2;
                min2=nums[i];
                
            }
            else if(nums[i]<min1){
                min1=nums[i];
            }
        }
        return Math.max(max1*max2*max3,max3*min1*min2);
    }
}
public class maximumProduct {
public static void main(String[] args) {
    Solution obj=new Solution();
    int []nums={-100,-98,-1,2,3,4};
    System.out.println(obj.maximumProduct(nums));
}
    
}