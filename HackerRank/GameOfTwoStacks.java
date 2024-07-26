// https://www.hackerrank.com/challenges/game-of-two-stacks/problem

//Method 1
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */
/* 
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
    return twoStack(maxSum,a,b,0,0)-1;
    }
    private static int twoStack(int x, List<Integer> a, List<Integer> b, int sum, int count) {
        if (sum > x) {
            return count;
        }
        if (a.isEmpty() && b.isEmpty()) {
            return count;
        }
        int ans1 = count;
        int ans2 = count;
        if (!a.isEmpty()) {
            ans1 = twoStack(x, a.subList(1, a.size()), b, sum + a.get(0), count + 1);
        }
        if (!b.isEmpty()) {
            ans2 = twoStack(x, a, b.subList(1, b.size()), sum + b.get(0), count + 1);
        }
        return Math.max(ans1, ans2);
    }

}*/

// Method 2

