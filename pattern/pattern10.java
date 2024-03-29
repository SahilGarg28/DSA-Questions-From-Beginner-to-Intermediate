public class pattern10 {
    public static void main(String[] args) {
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
