import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    // making a program to generate random numbers
    public static int[] randomNumber(int number) {
        Random random = new Random();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            int randomNumber = random.nextInt(-10000,100001);
            // you can set a range if you want from which the random number must be generated
            // we can also put the random numbers generated into an array if we want
            arr[i]=randomNumber;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("This is a program to generate random numbers using a method in java.");
        System.out.println("Enter the amount of random numbers you want to generate : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("The random numbers generated are : ");
        System.out.println(Arrays.toString(randomNumber(input)));
        scanner.close();
    }
}