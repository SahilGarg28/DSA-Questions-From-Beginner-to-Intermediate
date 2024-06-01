public class reverse {
    public static void main(String[] args) {
        System.out.println(reverseNum(123));
    }
    static int reverseNum(int n){
        if(n/10==0){
            return n;
        }
        return 10*(n%10)+reverseNum(n/10);
    }

}
