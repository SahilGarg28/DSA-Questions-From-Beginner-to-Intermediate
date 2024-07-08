// https://leetcode.com/problems/happy-number/
// 
// 1st method takes 0ms
    class Solution {
        public boolean isHappy(int n) {
            int slow=n,fast=n;
            do{
                slow=sumSquareDigit(slow);
                fast=sumSquareDigit(sumSquareDigit(fast));
    
            }while(slow!=fast);
            return slow==1;
        }
        private int sumSquareDigit(int n){
            int sum=0;
            while(n!=0){
                sum=sum+((n%10)*(n%10));
                n=n/10;
            }
            return sum;
        }
    }

// Second method takes 1ms 
/*  import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = squareOfDigit(n);
        }
        return n == 1;
    }
    int squareOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}*/