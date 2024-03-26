//https://leetcode.com/problems/transpose-matrix/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row_len=matrix.length;
        int col_len=matrix[0].length;
        int ans[][]=new int[col_len][row_len];
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}