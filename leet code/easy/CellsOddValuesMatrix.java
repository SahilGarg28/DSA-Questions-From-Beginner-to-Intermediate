//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        for(int[] index:indices){
            incrementRow(matrix,index[0]);
            incrementColumn(matrix,index[1]);
        }
        int count=0;
        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public void incrementRow(int[][] matrix, int rowIndex) {
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            matrix[rowIndex][j]++;
        }
    }

    public void incrementColumn(int[][] matrix, int colIndex) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][colIndex]++;
        }
    }
}