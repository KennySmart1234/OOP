package bankApp;

public class Account {

    int balance;
    String savedPassword;

    public Account(){

        savedPassword = "AbcDE12345";

    }
    public int getBalance() {

        return balance;
    }

    public int deposit(int  amount) {
        if (amount > 0){
            balance = balance + amount;
        }
        return balance;
    }

    public int withdraw(int amount, String password) {

        if(password.equals(savedPassword)) {
            if (amount > 0) {
                balance = balance - amount;
            }
        }
        return balance;
    }
}
