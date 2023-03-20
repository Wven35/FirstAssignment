




  /*              public class main {
        // draws a diamond of asterisks
        public void main() {
                Scanner input = new Scanner(System.in);

                int row; // current row
                int stars; // number of stars
                int spaces; // number of spaces
                int numRows; // number of rows

                // ask user for an entry until within range
                do {
                        System.out.print("Enter number of rows (odd number 1 to 19): ");
                        numRows = input.nextInt();
                } while ((numRows > 19) || (numRows < 0) ||
                        (numRows % 2 == 0));

                // top half
                for (row = 1; row < (numRows / 2) + 1; row++) {
                        for (spaces = numRows / 2; spaces >= row; spaces--)
                                System.out.print(" ");

                        for (stars = 1; stars <= (2 * row) - 1; stars++)
                                System.out.print("*");

                        System.out.println();
                } // end for loop

                // bottom half, note that the first clause of the for
                // loop isn't needed; row is already defined
                for (; row >= 1; row--) {
                        for (spaces = numRows / 2; spaces >= row; spaces--)
                                System.out.print(" ");

                        for (stars = 1; stars <= (2 * row) - 1; stars++)
                                System.out.print("*");
                        System.out.println();
                } // for
        } // class
} // main
        } */

