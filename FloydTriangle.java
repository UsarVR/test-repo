import java.util.Scanner;

public class FloydTriangle {
    static void floydTriangle(int rows) {
        int temp = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the Floyd's triangle using a method.");
        System.out.println("Enter the number of rows you want in the triangle : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        floydTriangle(input);
        scanner.close();
    }
}
