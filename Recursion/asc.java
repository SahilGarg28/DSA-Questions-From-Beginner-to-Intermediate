public class asc {
    public static void main(String[] args) {
        printAsc(5);
    }
    static void printAsc(int n){
        if(n>0){
            printAsc(n-1);
            System.out.println(n);
        }
    }
}
