public class numbers {
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
    static void print(int n)
    {
        if(n==6)
        {
            return;
        }
        else{
            System.out.println(n);
            print(n+1);
        }
    }
}
