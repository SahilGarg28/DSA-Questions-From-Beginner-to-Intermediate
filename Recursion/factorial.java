public class factorial {
    public static void main(String[] args) {
        int factorial=fact(1);
        System.out.println(factorial);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
