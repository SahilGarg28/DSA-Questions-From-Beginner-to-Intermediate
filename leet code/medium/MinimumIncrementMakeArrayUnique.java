public class MinimumIncrementMakeArrayUnique {
    
}
/*
 * class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int tempans=0;
        int lastUpdate=-1;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])
            {
                tempans=nums[i]+1;
                int j=i+1;
                while(j+1<nums.length&&!(tempans!=nums[j]&&tempans!=nums[j+1]))
                {
                    tempans++;
                    j++;
                }
                ans=ans+(tempans-nums[i]);
                nums[i]=tempans;
                Arrays.sort(nums);
                i--;
                tempans=0;
            }
        }
        return ans;
    }
}
 */
 