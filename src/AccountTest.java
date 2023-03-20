import java.util.Scanner;

//////////////////
// Static class to DRIVE the Account Object!
// Created by Will Venable
//
public class AccountTest {
    public static void main(String[] args) {
        // Create a Scanner object called "input".
        Scanner input = new Scanner(System.in);

        Account account1 = new Account( "Manayeh", 1_000_000_000.01);
        Account account2 = new Account( "Noah", 10.03);

        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account1 balance is: %.2f%n", account1.getBalance());
        System.out.printf("account2 name is: %s%n", account2.getName());
        System.out.printf("account2 balance is: %.2f%n", account2.getBalance());


      /*  // Create an ACCOUNT called "myAccount".
        Account myAccount = new Account();

        // Print the NAME of the account holder.
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // Prompt user for a name.
        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        // Display the user's name that was set by setName()
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName()); */
    } // End: main
} // End: public class