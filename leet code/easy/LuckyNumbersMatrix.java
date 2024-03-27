//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int row=0;row<m;row++)
        {
            int minRow=matrix[row][0];
            int colNo=0;
            for(int col=0;col<n;col++)
            {
                if(matrix[row][col]<minRow)
                {
                    minRow=matrix[row][col];
                    colNo=col;
                }
            }
            int maxElement = matrix[row][colNo];
            boolean isLucky = true;
            for (int i = 0; i < m; i++) {
                if (maxElement < matrix[i][colNo]) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                ans.add(maxElement);
            }
            
        }
        return ans;
    }
}