// package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(50));
    }
    public static int Fibonacci(int n) {
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
