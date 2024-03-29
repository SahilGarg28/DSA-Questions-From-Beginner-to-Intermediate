public class pattern13 {
    public static void main(String[] args) {
        
        int newCount=0;
        for(int r=1;r<5;r++)
        {
            int count=0;
            for(int i=r;i<5;i++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            count++;
            
            for(int j=1;j<=newCount;j++)
            {
                System.out.print(" ");
                count++;
            }
            if(r!=1)
            {
                System.out.print("*");
                count++;
            }
            newCount=count;
            System.out.println();
        }
        for(int c=1;c<=9;c++)
        {
            System.out.print("*");
        }
    }
}
// public class pattern13 {
//     public static void main(String[] args) {
//         // Print the upper part of the pattern
//         for (int i = 1; i <= 4; i++) {
//             // Print spaces
//             for (int j = i; j < 5; j++) {
//                 System.out.print(" ");
//             }
            
//             // Print the first '*'
//             System.out.print("*");
            
//             // Print spaces or '*' characters between the first and last '*'
//             if (i > 1) {
//                 for (int k = 1; k <= (2 * i - 3); k++) {
//                     System.out.print(" ");
//                 }
//                 System.out.print("*");
//             }
            
//             // Move to the next line
//             System.out.println();
//         }

//         // Print the bottom line of stars
//         for (int c = 1; c <= 9; c++) {
//             System.out.print("*");
//         }
//     }
// }
