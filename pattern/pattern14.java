public class pattern14 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int r=2;r<=5;r++){
            for(int i=1;i<=r-1;i++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            if(r<5){
            for(int j=1;j<=-2*r+9;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        }
    }
}
