public class pattern12 {
    public static void main(String[] args) {
        for(int r=1;r<=5;r++)
        {
            for(int i=1;i<=r-1;i++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=5-r+1;c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int r=1;r<=5;r++)
        {
            for(int c=1;c<=5-r;c++)
            {
                System.out.print(" ");
            }
            for(int i=1;i<=r;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
