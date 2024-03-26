//https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sump=0,sums=0;
        for(int i=0,j=mat.length-1;i<mat.length;i++)
        {
            sump=sump+mat[i][i];
            sums=sums+mat[j][i];
            j--;
        }
        if(mat.length%2!=0)
        {
            return sump+sums-mat[mat.length/2][mat.length/2];
        }
        return sump+sums;
        
    }
}