public class prime {
    public static void main(String[] args) {
        int n=37;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
