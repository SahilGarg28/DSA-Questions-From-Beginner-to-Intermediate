public class pattern9 {
    public static void main(String[] args) {
        for(int r=1;r<=5;r++)
        {
            for(int i=1;i<=r-1;i++)
            {
                System.out.print(" ");
            }
            for(int c=r;c<=2*5-r;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
