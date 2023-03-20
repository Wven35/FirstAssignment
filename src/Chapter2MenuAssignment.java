import java.util.Scanner;
public class Chapter2MenuAssignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What Operation?\n 1: Addition\n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: Remainder\n");
        int operation = in.nextInt();

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        if (operation == 1){
            int sum = num1 + num2;
            System.out.printf("Sum is %d%n", sum);}

        if (operation == 2){
            int sum = num1 - num2;
            System.out.printf("Difference is %d%n", sum);}

        if (operation == 3){
            int sum = num1 * num2;
            System.out.printf("Product is %d%n", sum);}

        if (num2==0){
            System.out.println("Cannot Divide by 0");}

        if (num1==0) {
            System.out.println("Cannot Divide by 0");}

        if (operation == 4){
            int sum = num1 / num2;
            System.out.printf("Quotient is %d%n", sum);}

        if (operation == 5){
            int sum = num1 % num2;
            System.out.printf("Remainder is %d%n", sum);}

    } // End public static void

} // End Chapter2MenuAssignment