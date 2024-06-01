public class sum {
    public static void main(String[] args) {
        int sum=sum(5);
        System.out.println(sum);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
