// Created by Will Venable
import java.util.Scanner;
public class diamondmake {
        public static void main(String[] args) {
            //Initialize the number of rows of the upper triangle.
            int size =  5;
            // Outer loop
            for (int i=0; i<size; i++){

                // Inner for loop
                for(int j=size; j>i; j--)
                    System.out.print(" ");
                for (int x=0; x<(2*i)+1; x++)
                    System.out.print("*");
                System.out.println();

            } // for
                // Outer loop of the Lower Triangle. inverted.
            for (int i=size-1; i>=0; i--){
                //Inner for loop
                for (int j=size; j>=i; j--)
                    System.out.print(" ");
                for (int x=1; x<=(2*i)-1; x++)
                    System.out.print("*");
                System.out.println();
            } // for
        } // main
    } // diamondmake
