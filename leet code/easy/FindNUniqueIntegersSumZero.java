//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];
        if(n==1)
        {
            ans[0]=0;
            return ans;
        }
        ans[0]=n/2;
        ans[1]=-1*ans[0];
        for(int i=2;i<n;i+=2)
        {   
            if(i==n-1){
            ans[n-1]=0;}
            else{
            ans[i]=ans[i-2]-1;
            ans[i+1]=-1*ans[i];
            }
          
            
            
        }
        return ans;
    }
}