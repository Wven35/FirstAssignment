// This will calculate the grade average.
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class ClassAverage {
    public static void main(String[] args) {

        // Used for user input.
        Scanner input = new Scanner(System.in);

        // Int Var's
        int total = 0;
        int gradeCounter = 0;

        System.out.printf("Enter grade of -1 to quit");
        int grade = input.nextInt();

        // loop through for each of the grades.
        while( grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.printf("Enter grade of -1 to quit");
            grade = input.nextInt();
        }

        // Check to see if we have GRADES.
        if ( gradeCounter != 0) {

            // Calculate the average
            double average = (double) total / gradeCounter;

            System.out.printf("%nTotal of all %d grades is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2fd%n", average);
        }
        else {
            System.out.printf("No grades were entered");
        }
    }
} // End: public class
