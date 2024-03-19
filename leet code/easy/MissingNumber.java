// https://leetcode.com/problems/missing-number/submissions/

//method 1

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] < n && nums[i] != i) {
                swap(nums, i, nums[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// ________________________________Method 2______________

class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        return (n*(n+1)/2)-sum;
    }
}