//https://leetcode.com/problems/plus-one/
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            // if 9 (9 + 1 = 10, put 0 carry 1)
            digits[i] = 0; 
        }
        
        // When all elements are 9
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}