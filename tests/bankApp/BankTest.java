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

}