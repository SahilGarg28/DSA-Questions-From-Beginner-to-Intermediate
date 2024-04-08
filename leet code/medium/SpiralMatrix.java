import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int c = matrix[0].length;
        int ans[] = new int[m * c];
        int count = 0;
        int startRow = 0;
        int startColumn = 0;
        int endRow = m - 1;
        int endColumn = c - 1;

        while (count < ans.length) {
            count = row(matrix, startRow, startColumn, endRow, endColumn, ans, count);
            startRow++;
            if (count >= ans.length) break;
            count = column(matrix, startRow, endRow, endColumn, ans, count);
            endColumn--;
            if (count >= ans.length) break;
            count = reverseRow(matrix, endRow, startColumn, endColumn, ans, count);
            endRow--;
            if (count >= ans.length) break;
            count = reverseColumn(matrix, startRow, startColumn, endRow, ans, count);
            startColumn++;
        }
        List<Integer> result = new ArrayList<>();
        for (int num : ans) {
            result.add(num);
        }
        return result;
    }

    public int row(int[][] matrix, int startRow, int startColumn, int endRow, int endColumn, int[] ans, int sIndex) {
        for (int i = startColumn; i <= endColumn; i++) {
            ans[sIndex++] = matrix[startRow][i];
        }
        return sIndex;
    }

    public int column(int[][] matrix, int startRow, int endRow, int endColumn, int[] ans, int sIndex) {
        for (int i = startRow; i <= endRow; i++) {
            ans[sIndex++] = matrix[i][endColumn];
        }
        return sIndex;
    }

    public int reverseRow(int[][] matrix, int endRow, int startColumn, int endColumn, int[] ans, int sIndex) {
        for (int i = endColumn; i >= startColumn; i--) {
            ans[sIndex++] = matrix[endRow][i];
        }
        return sIndex;
    }

    public int reverseColumn(int[][] matrix, int startRow, int startColumn, int endRow, int[] ans, int sIndex) {
        for (int i = endRow; i >= startRow; i--) {
            ans[sIndex++] = matrix[i][startColumn];
        }
        return sIndex;
    }
}
