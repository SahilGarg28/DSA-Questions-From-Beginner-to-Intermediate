//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // int []target=new int[nums.length];
        ArrayList<Integer> target=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        target.add(index[i],nums[i]);
        }
        int []ans=new int[nums.length];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=target.get(i);
        }
        return ans;
    }
}