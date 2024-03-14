import java.util.Scanner;

// Define a class to print the maximum and the minimum number among three numbers entered by the user.
public class Max_Min {
    int maximum(int num1, int num2, int num3) {
        if (num1 >= num2) {
            if (num1 >= num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 >= num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    int minimum(int num1, int num2, int num3) {
        if (num1 <= num2) {
            if (num1 <= num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 <= num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter number 2:");
        int num2 = input.nextInt();
        System.out.println("Enter number 3:");
        int num3 = input.nextInt();

        Max_Min maxMin = new Max_Min();
        System.out.println("Maximum number: " + maxMin.maximum(num1, num2, num3));
        System.out.println("Minimum number: " + maxMin.minimum(num1, num2, num3));
    }
}
