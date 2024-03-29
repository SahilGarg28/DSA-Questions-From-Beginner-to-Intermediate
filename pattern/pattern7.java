public class pattern7 {
    public static void main(String[] args) {
        for(int r=1;r<=5;r++)
        {
            for(int i=1;i<r;i++){
                System.out.print(" ");
            }
            for(int c=5;c>=r;c--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
