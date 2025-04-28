package FinalProject;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit completed successfully!");
        } else {
            System.out.println("Incorrect amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Insufficient funds or not valid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
