// Created by Will Venable
import java.util.Scanner;
public class diamond2 {
        // instance variable to store the number
        int r;
        // constructor to create objects of this class
        public diamond2(int rows){
            // store the number of rows in the upper half
            r = rows/2 + 1;
        } // public
        // method to print the Diamond
        public void printDiamond(){
          // upper half
            for(int i = 0; i < r; i++){
                // Inner Loop 1
                for(int j = 0; j < r-i-1; j++){
                    System.out.print(" ");
                }
                // Inner Loop 2
                for(int j = 0; j < (2*i+1); j++){
                    System.out.print("*");
                }
                // Inner Loop 3
                for(int j = 0; j < r-i-1; j++){
                    System.out.print(" ");
                }
                // Change the row
                System.out.println();
            } // for
           // lower half
            for(int i = r-2; i >= 0; i--){
                // Inner Loop 1
                for(int j = 0; j < r-i-1; j++){
                    System.out.print(" ");
                }
                // Inner Loop 2
                for(int j = 0; j < (2*i+1); j++){
                    System.out.print("*");
                }
                // Inner Loop 3
                for(int j = 0; j < r-i-1; j++){
                    System.out.print(" ");
                }
                // Change the row
                System.out.println();
            } // for
        } // void
        // Driver method
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int rows = sc.nextInt();
            diamond2 obj = new diamond2(rows);
            obj.printDiamond();
        } // main
    } // diamond2
