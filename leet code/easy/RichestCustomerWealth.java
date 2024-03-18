// package leet code.easy;
//https://leetcode.com/problems/richest-customer-wealth/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int []account:accounts)
        {
            int amount=account_wealth(account);
            if(amount>max)
                max=amount;
        }
        return max;
    }
    int account_wealth(int []account)
    {
        int amount=0;
        for(int i=0;i<account.length;i++)
        {
            amount+=account[i];
        }
        return amount;
    }
}
