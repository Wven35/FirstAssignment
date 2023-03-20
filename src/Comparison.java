import java.util.Scanner;
// Demo's comparison operators.
public class Comparison {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Get first value from the user.
            System.out.print("Enter first integer: ");
            int number1 = input.nextInt();


            // Get second value from user.
            System.out.print("Enter second integer: ");
            int number2 = input.nextInt();

            // compare operators and branch accordingly.
            if (number1 == number2) {
                System.out.printf("%d == %d%n", number1, number2);
                System.out.println("In the \"if\" statement");}

            if (number1 == number2) {
                System.out.printf("%d != %d%n", number1, number2);
                System.out.println("In the \"if\" statement");}

            if (number1 >= number2) {
                System.out.printf("%d == %d%n", number1, number2);
                System.out.println("In the \"if\" statement");}

            if (number1 <= number2) {
                System.out.printf("%d == %d%n", number1, number2);
                System.out.println("In the \"if\" statement");}
        }//End: main.
        }// End: Comparison Class