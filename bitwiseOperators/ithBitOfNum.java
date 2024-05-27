// package bitwiseOperators;

public class ithBitOfNum {
    public static void main(String[] args) {
        int n=5;
        int i=5;
        if((n & (1<<(i-1)))==0)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("1");
        }
    }
}
