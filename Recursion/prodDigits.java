public class prodDigits {
    public static void main(String[] args) {
        System.out.println(prodOfDigits(1342));
    }
    static int prodOfDigits(int n){
        if(n==1)
        {
            return 1;
        }
        return (n%10)*prodOfDigits(n/10);
    }
}

