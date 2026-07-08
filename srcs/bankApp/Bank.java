package bankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int accountNumber = 100;
    private String bankName;
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }


    public Account registerCustomer(String firstName, String lastName, String pin) {
        String accountNumber = generateAccountNumber();
        Account customerAccount = new Account(accountNumber, firstName, lastName, pin);
        accounts.add(customerAccount);
        return customerAccount;
    }

        private String generateAccountNumber() {

            return String.valueOf(++accountNumber);
        }

    public int getNumberOfAccounts() {
        return accounts.size();
    }


    public Account findAccount(String accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;

            }
        }
                throw new IllegalArgumentException("Account not found");


    }

    public void deposit(String accountNumber, int amount) {
            Account account = findAccount(accountNumber);
            account.deposit(amount);
    }

    private Account getAccount(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        return account;
    }

    public void withdraw(String accountNumber, int amount, String pin) {
        getAccount(accountNumber).withdraw(amount, pin);
    }

    public int checkBalance(String pin, String accountNumber) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);

    }

    public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount, String pin) {
        getAccount(senderAccountNumber).withdraw(amount, pin);
        getAccount(receiverAccountNumber).deposit(amount);
    }


    public void removeAccount(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        if(!account.vaidatePin(pin)){
            throw new IllegalArgumentException("Invalid pin");
        }

        accounts.remove(account);
    }


}