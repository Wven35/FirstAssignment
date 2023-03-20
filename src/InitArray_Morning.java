// This is a class that is used to demonstrate the use of arrays.
public class InitArray_Morning {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};


        // Print the header.
        System.out.printf("%s%8%n", "Index", "Value");

       //array[0] = -45;
       //array[1] = 6;
        //array[2] = 0;

        // Loop through each array element and print the
        // counter and the value of the corresponding array element.
        //
        for( int counter = 0; counter < array.length; counter ++ ){
            System.out.printf("%5d%8d%n", counter, array[counter]);

        } // for
    } // main
} // InitArray_Morning
