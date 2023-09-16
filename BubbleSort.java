import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    // making a method which can sort an array of integers using bubble sort
    static void ascendingBubbleSort(int[] arr) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swapping the two values :
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    b = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("This is a program which uses bubble sort to sort an array of integers in ascending order.");
        System.out.println("Enter the number of random numbers you want to generate : ");
        // generating random numbers to be sorted using bubble sort
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("The random numbers generated are : ");
        int[] arr = RandomNumberGenerator.randomNumber(input);
        System.out.println(Arrays.toString(arr));
        System.out.println("The sorted elements are : ");
        ascendingBubbleSort(arr);
        scanner.close();
    }
}
