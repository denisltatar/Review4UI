/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author tatad6701
 */
public class TestBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // First account actions
        BankAccount a1 = new BankAccount("Lamont", 1234, 100);
        System.out.println("Initial balance: " + a1.checkFunds());
        System.out.println("Account number: " + a1.getAccountNumber());

        // Second account actions
        BankAccount a2 = new BankAccount("Another", 1324, 200);
        System.out.println("Initial balance: " + a2.checkFunds());
        System.out.println("Account number: " + a2.getAccountNumber());

        // Transfering mula from one account to another                         
        System.out.println("TRANSFER:");
        a1.transferFundsTo(a2, 100);
        System.out.println("Initial balance: " + a2.checkFunds());
        System.out.println("Account number: " + a2.getAccountNumber());
        System.out.println("Initial balance: " + a1.checkFunds());
        System.out.println("Account number: " + a1.getAccountNumber());
    }
}
