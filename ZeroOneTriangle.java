import java.util.Scanner;

// You have to print a triangle with the following pattern:
// 1
// 0 1
// 1 0 1
// 0 1 0 1
public class ZeroOneTriangle {
    static void zeroOneTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j > 0; j--) {
                if (i % 2 == 1 && (i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else if (i % 2 == 1 && (i + j) % 2 == 1) {
                    System.out.print("0 ");
                } else if (i % 2 == 0 && (i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else if (i % 2 == 0 && (i + j) % 2 == 1) {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want in the zero one triangle : ");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        zeroOneTriangle(numberOfRows);
        scanner.close();
    }
}
