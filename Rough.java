import java.util.Scanner;

public class Rough {
    public static void butterflyPattern(int rows) {
        // code to print out the upper half of the pattern :
        for (int i = 1; i <= rows / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= rows - 2 * i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // code to print out the lower half of the pattern :
        for (int i = rows / 2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= rows - 2 * i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the butterfly pattern using a method.");
        System.out.println("Enter the number of rows you want in the pattern : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        butterflyPattern(rows);
        scanner.close();
    }
}