package bankApp;

public class Account {

    private String firstName;
    private  String lastName;
    private int balance;
    private String pin;
    private String accountNumber;

    public Account(String accountNumber, String lastName, String firstName,  String pin) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(String pin) {
        if (isValidPin(pin)) return balance;
        else throw new IllegalArgumentException("Invalid Pin");
    }

    private boolean isValidPin(String pin) {
        if (this.pin.equals(pin)) return true;
        return false;
    }

    public boolean vaidatePin(String pin) {
        return isValidPin(pin);
    }

    public int deposit(int  amount) {

        boolean isGreterThanZero = amount > 0;

        if (isGreterThanZero){
            balance = balance + amount;
        }
        return balance;
    }

    public void withdraw(int amount, String pin) {

        if(!isValidPin(pin)) throw new IllegalArgumentException("Invalid Pin");
        if (amount <= 0) throw new IllegalArgumentException("Invalid Amount");

        balance = balance - amount;
    }

}
