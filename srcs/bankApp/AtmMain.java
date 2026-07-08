package bankApp;
import bankApp.Account;
import bankApp.Bank;

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



                case "2":


                case "3":


                case "4":


                case "5":


                case "6":
                    System.out.println("==============================");
                    System.out.println("THANK YOU");
                    System.out.println("==============================");
                    condition = false;
                    break;

                default:
                    System.out.println("Invalid Input.");
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

}


