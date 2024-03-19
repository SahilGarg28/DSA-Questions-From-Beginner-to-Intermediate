//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
      
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                ans.add(i+1);
            }
        }
        return ans;
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}