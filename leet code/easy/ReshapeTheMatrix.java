//https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][]reshaped=new int[r][c];
        int m=mat.length;
        int n=mat[0].length;
        int i=0,j=0;
        if(m*n!=r*c)
        {
            return mat;
        }
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {   
                if(j<c){
                reshaped[i][j]=mat[row][col];
                    j++;}
                else{
                    j=0;
                    i++;
                    reshaped[i][j]=mat[row][col];
                    j++;
                }
                
            }
        }
        return reshaped;
    }
}