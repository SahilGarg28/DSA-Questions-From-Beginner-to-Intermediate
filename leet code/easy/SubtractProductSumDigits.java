// package leet code.easy;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1,sum=0;
        while(n!=0)
        {
            int rm=n%10;
            int rs=rm;
            n=n/10;
            prod=prod*rm;
            sum=sum+rs;
        }
        return prod-sum;
    }
}
