import java.util.Scanner;

// Get input from the user, add numbers, report out.
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt(); //Get a number from user!!

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt(); // Get another number!

        // Process step!
        int sum = number1 + number2;

        // Print the number for the user!
        System.out.printf("The sum is %d. NEW LINE===>%n", sum);

    } // END: main
} // END: HelloWorld

