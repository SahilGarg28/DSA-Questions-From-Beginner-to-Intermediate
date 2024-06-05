/*


 * * * *
 * * *
 * *
 * 
 
 
 */
public class pattern1 {
    public static void main(String[] args) {
        int r=4,c=1;
        printPattern(r,c);
    }
    static void printPattern(int r,int c){
        if(r>0){
            if(c<=r){
                System.out.print("* ");
                printPattern(r, c+1);
            }
            else{
            System.out.println("");
            printPattern(r-1, 1);}
        }
    }
}
