import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + "numbers :");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int result = findLargest(numbers);
        System.out.println("The largest number is: " + result);
    }

    public static int findLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}
