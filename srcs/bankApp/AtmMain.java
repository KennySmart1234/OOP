package bankApp;

import java.util.Scanner;

public class AtmMain {

    private static final Scanner input = new Scanner(System.in);
    private static final Bank bank = new Bank();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {

            displayMenu();

            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine();

            try {

                switch (option) {

                    case 1:
                        registerCustomer();
                        break;

                    case 2:
                        deposit();
                        break;

                    case 3:
                        withdraw();
                        break;

                    case 4:
                        transfer();
                        break;

                    case 5:
                        checkBalance();
                        break;

                    case 6:
                        removeAccount();
                        break;

                    case 7:
                        System.out.println("Thank you for banking with us.");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid option.");
                }

            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }

            System.out.println();
        }
    }

    private static void displayMenu() {

        System.out.println("""
                ==============================
                      SEMICOLON BANK
                ==============================
                1. Register Customer
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Check Balance
                6. Remove Account
                7. Exit
                ==============================
                """);
    }

    private static void registerCustomer() {

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Create 4-digit Pin: ");
        String pin = input.nextLine();

        Account account = bank.registerCustomer(firstName, lastName, pin);

        System.out.println("\nCustomer Registered Successfully.");
        System.out.println("Account Number: " + account.getAccountNumber());
    }

    private static void deposit() {

        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter Amount: ");
        int amount = input.nextInt();
        input.nextLine();

        bank.deposit(accountNumber, amount);

        System.out.println("Deposit Successful.");
    }

    private static void withdraw() {

        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter Pin: ");
        String pin = input.nextLine();

        System.out.print("Enter Amount: ");
        int amount = input.nextInt();
        input.nextLine();

        bank.withdraw(accountNumber, amount, pin);

        System.out.println("Withdrawal Successful.");
    }

    private static void transfer() {

        System.out.print("Enter Sender Account Number: ");
        String senderAccount = input.nextLine();

        System.out.print("Enter Receiver Account Number: ");
        String receiverAccount = input.nextLine();

        System.out.print("Enter Pin: ");
        String pin = input.nextLine();

        System.out.print("Enter Amount: ");
        int amount = input.nextInt();
        input.nextLine();

        bank.transfer(senderAccount, receiverAccount, amount, pin);

        System.out.println("Transfer Successful.");
    }

    private static void checkBalance() {

        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter Pin: ");
        String pin = input.nextLine();

        int balance = bank.checkBalance(pin, accountNumber);

        System.out.println("Current Balance: ₦" + balance);
    }

    private static void removeAccount() {

        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter Pin: ");
        String pin = input.nextLine();

        bank.removeAccount(accountNumber, pin);

        System.out.println("Account Removed Successfully.");
    }
}