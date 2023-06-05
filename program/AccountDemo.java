package program;

import java.util.*;

public class AccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get account details from the user
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        // Create a bank account object
        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);

        // Display account details
        account.displayAccountDetails();

        // Perform withdrawals
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        scanner.close();
    }
}

