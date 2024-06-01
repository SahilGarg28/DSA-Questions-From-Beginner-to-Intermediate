https://leetcode.com/problems/single-number-iii/
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans[]=new int[2];
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==nums[i+1]){
                i=i+1;
            }
            else{
                ans[j++]=nums[i];
                
            }
            if(i+1==nums.length-1){
                    ans[1]=nums[i+1];
                    break;
                }
        }
        return ans;
    }
}