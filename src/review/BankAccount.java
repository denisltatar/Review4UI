/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author tatad6701
 */
public class BankAccount {

    // How many acccount does your bank account have?
    // Shared between all bankaccounts
    // Static is shared between all the methods
    private static int currentAccounts = 0;
    // Instance variables
    private double amount;
    private int pin;
    private int accountNumber;
    private String name;

    // What you need to create a bank account
    // This is called the constructor 
    // Initial setup that needs to happen before using
    public BankAccount(String name, int pin, double initialBalance) {
        amount = initialBalance;
        // Setting both equal so that the one above changed depending on what is inputted!
        // Using the int from up above!
        this.name = name;
        this.pin = pin;
        // Add 1 to create an account 
        BankAccount.currentAccounts++;
        // Set the account number 
        this.accountNumber = BankAccount.currentAccounts;
    }

    // Class Methods
    public void withDraw(double amount) {
        // Is the amount bigger than 0 and if the bank has enough in the account
        if (amount > 0 && this.amount >= amount) {
            // Subrtact the amount in the bank and make it equal to the amount witdrawn
            this.amount -= amount;
        }
    }

    // Deposit
    public void deposit(double amount) {
        // If the deposit is greater than 0
        if (amount > 0) {
            // Make a new bank amount
            this.amount += amount;
        }
    }

    // Check Funds
    public double checkFunds() {
        // Return the amount in the specific account
        return this.amount;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void transferFundsTo(BankAccount a, double amount) {
        // Check to tansfer proper amount
        if (this.amount >= amount) {
            // Withdraw the money in order to transfer it                                           
            this.withDraw(amount);
            // Transfer the money over
            a.deposit(amount);
        }
    }
}
