package bankApp;


import java.util.Scanner;

public class AtmMain {

    private static final Scanner input = new Scanner(System.in);
    private static Bank bank;

    public static void main(String[] args) {

        bank = new Bank();

        boolean condition = true;

        while (condition) {

            userMenu();

            System.out.print("Enter an option: ");
            String option = input.nextLine();

            switch (option) {

                case "1":
                    createAccount();


                case "2":
                    deposit();


                case "3":
                    withdraw();


                case "4":
                    checkBalance();


                case "5":
                    transfer();

                case "6":
                    System.out.println("**********************************");
                    System.out.println("THANK YOU FOR BANKING WITH US!");
                    System.out.println("**********************************");
                    condition = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void userMenu() {
        System.out.println("""
                ===== GTB BANK =====
                1. Create Account
                2. Deposit
                3. Withdraw
                4. Check Balance
                5. Transfer
                6. Exit
                """);
    }

    private static void createAccount() { }

    private static void deposit() { }

    private static void withdraw() { }

    private static void checkBalance() { }

    private static void transfer() { }
}


