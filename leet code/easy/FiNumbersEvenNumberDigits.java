//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
        
    }
    boolean even(int num)
    {
        return digit(num)%2==0;
    }
    int digit(int num){
        if(num<0)
        {
            num=-1*num;
        }
        return (int)(Math.log10(num)+1);
    }
}