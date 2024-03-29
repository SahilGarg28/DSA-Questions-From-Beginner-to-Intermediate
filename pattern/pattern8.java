public class pattern8 {
    public static void main(String[] args) {
        for(int r=1;r<=5;r++)
        {
            for(int c=5;c>r;c--)
            {
                System.out.print(" ");
            }
            for(int i=1;i<=2*r-1;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
