import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);

        // Ask user for first number
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        // Ask user for second number
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Print result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scan.close(); // Close scanner
    }
}
