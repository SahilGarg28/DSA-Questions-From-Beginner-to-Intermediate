//https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] a) {
        int[] b = Arrays.copyOf(a, 2 * a.length);
        System.arraycopy(a, 0, b, a.length, a.length);
        return b;
    }
}
