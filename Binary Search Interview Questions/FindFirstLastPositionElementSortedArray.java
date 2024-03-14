// package Binary Search Interview Questions;
// 34. Find First and Last Position of Element in Sorted Array leetcode
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        ans[0] = starting(nums, target);
        ans[1] = ending(nums, target);
        return ans;
    }

    int starting(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int result = -1;
        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (target <= nums[mid]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
            if (nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }

    int ending(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int result = -1;
        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (target >= nums[mid]) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
            if (nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }
}
