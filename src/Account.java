/////////////////////////
//Created by: Will Venable
//
// This is used to track account information for a user.

public class Account {
    private String name;        // This stores the user's name.
    private double balance;

    // CONSTRUCTOR!
    // This code runs when the object is created (i,e., instantiated!)
    public Account(String name, double balance) {
        this.name = name;

        // Only allow a positive entry!
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        // Only allow a positive entry!
        if (balance > 0.0) {
            this.balance += depositAmount;
        }
    }

    // Get the User's Balance.
    public double getBalance(){
        return( this.balance );
    }


    // this stores the user's name
    //private String name;

    // This sets the class INSTANCE variable "name" to a value.
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return( this.name );
    }
} // End public class account