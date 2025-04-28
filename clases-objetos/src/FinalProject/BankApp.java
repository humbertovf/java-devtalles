package FinalProject;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            displayMenu();
            option = scanner.nextInt();
            processOption(option);
        }while (option != 4);
    }

    private void displayMenu() {
        System.out.println("\nSelect options");
        System.out.println("1 - Deposit");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Display balance");
        System.out.println("4 - Quit");
    }

    private int getuserOption() {
        return scanner.nextInt();
    }

    private void handleDeposit() {
        System.out.println("Deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }

    private void handleWithdraw() {
        System.out.println("Withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }

    private void processOption(int option) {
        switch(option) {
            case 1:
                handleDeposit();
                break;
            case 2:
                handleWithdraw();
                break;
            case 3:
                account.displayBalance();
                break;
            case 4:
                System.out.println("Thank you!");
                scanner.close();
                break;
            default:
                System.out.println("Option not valid.");
        }
    }
}
