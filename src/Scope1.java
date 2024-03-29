/** Exercise to examine SCOPE of variables.  */
public class Scope1 {
    // Field value of the class.
    private static int x = 1;

    public static void main(String[] args) {
        int x = 5; // Local variable "x" DIFFERS from the field "x".

        System.out.printf("local x in main is %d%n", x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("%nlocal x in main is %d%n", x);

    } // main

    private static void useField() {
        int x = 25;

        System.out.printf("%nlocal x on entering method useLocalVariable is%d%n", x);
        ++x;
        System.out.printf("%nlocal x before exiting method useLocalVariable is%d%n", x);
    } // useField

    private static void useLocalVariable() {
        System.out.printf("%nfield x on entering method useField is %d%n",x);
        x *=10;
        System.out.printf("field x before exiting method useField is %d%n",x);
    } // useLocalVariable
} // Scope1