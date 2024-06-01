public class desc {
    public static void main(String[] args) {
        printDesc(5);
    }
    static void printDesc(int n){
        if(n!=0){
           System.out.println(n); 
           printDesc(n-1);
        }
        
        
    }
}
