package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void createAccountTest() {
        Account account = bank.registerCustomer("kenny", "stephen", "1234");
        assertEquals(1, bank.getNumberOfAccounts());
    }

    @Test
    public void register2Customers_2AccountsAreCreated(){
        bank.registerCustomer("olatunji","stephen", "1234");
        assertEquals(1, bank.getNumberOfAccounts());
        bank.registerCustomer("Smart","kehinde", "1234");
        assertEquals(2, bank.getNumberOfAccounts());
    }

    @Test
    public void registerTwoAccounts_findAccountOfOneAccountTest(){
        Account customerOne = bank.registerCustomer("kenny","stephen", "1234");
        Account customerTwo = bank.registerCustomer("olatunji","smart", "1234");
        assertEquals(customerTwo,bank.findAccount("102"));
    }

    @Test
    public void registerOneAccounts_Deposited2000NairaInTheAccountTest(){
        Account customerOne = bank.registerCustomer("kenny","stephen", "1234");

        assertEquals(customerOne,bank.findAccount("101"));
        bank.deposit("101",2000);
        assertEquals(2000, bank.checkBalance("1234", "101"));

    }


    @Test
    public void registerTwoAccounts_Deposited500InAccountOne_Deposited1000InAccountTwoTest(){
        Account customerOne = bank.registerCustomer("kenny","stephen", "1234");
        Account customerTwo = bank.registerCustomer("olatunji","smart", "1234");
        assertEquals(customerOne, bank.findAccount("101"));
        assertEquals(customerTwo, bank.findAccount("102"));
        bank.deposit("101",500);
        assertEquals(500, bank.checkBalance("1234", "101"));
        bank.deposit("102",1000);
        assertEquals(1000, bank.checkBalance("1234", "102"));

    }

    @Test
    public void registerOneAccount_Deposited2000_Withdraw1500_Balance_500_Test(){
        Account customerOne = bank.registerCustomer("kenny","stephen", "1234");
        bank.deposit("101",2000);
        assertEquals(2000, bank.checkBalance("1234", "101"));
        bank.withdraw("101", 1500, "1234" );
        assertEquals(500, bank.checkBalance("1234", "101"));
    }

    @Test
    public void registerTwoAccount_Deposited2000InAccountOne_Transferred_1000InAccountTwoTest(){
        Account customerOne = bank.registerCustomer("kenny","stephen", "1234");
        Account customerTwo = bank.registerCustomer("olatunji","smart", "1234");
        assertEquals(customerOne,bank.findAccount("101"));
        assertEquals(customerTwo,bank.findAccount("102"));
        bank.deposit("101",2000);
        assertEquals(2000, bank.checkBalance("1234", "101"));
        bank.transfer("101", "102", 1000, "1234");
        assertEquals(1000, bank.checkBalance("1234", "101"));
        assertEquals(1000, bank.checkBalance("1234", "102"));
    }

    @Test
    public void registerTwoAccount_OneAccountWasRemovedTest(){
        Account customerOne = bank.registerCustomer("kenny","stephen", "1234");
        Account customerTwo = bank.registerCustomer("olatunji","smart", "1234");

        assertEquals(customerOne, bank.findAccount("101"));
        assertEquals(customerTwo, bank.findAccount("102"));
        bank.removeAccount("101", "1234");
        assertEquals(1, bank.getNumberOfAccounts());
    }

}