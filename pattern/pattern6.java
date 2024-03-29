public class pattern6 {
    public static void main(String[] args) {
        int rows = 5;

        // Loop through each row
        for(int i = 1; i <= rows; i++) {
            // Print spaces
            for(int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print '*' characters
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
