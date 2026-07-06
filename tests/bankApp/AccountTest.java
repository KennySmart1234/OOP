package bankApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class AccountTest {

    private Account KennyAccount;

    @BeforeEach
    public void setup(){

        KennyAccount = new Account();
    }

    @Test
    public void depoited2000inEmptyAccount_balanceis200Test(){

        Assertions.assertEquals(0,  KennyAccount.getBalance());
        KennyAccount.deposit(200);
        Assertions.assertEquals(200,  KennyAccount.getBalance());

    }

    @Test
    public void depoitMinus50_balanceis0Test(){

        Assertions.assertEquals(0,  KennyAccount.getBalance());
        KennyAccount.deposit(-50);
        Assertions.assertEquals(0,  KennyAccount.getBalance());

    }


    @Test
    public void depoit_200_deposit_500_balanceIs700Test(){
        Assertions.assertEquals(0,  KennyAccount.getBalance());

        KennyAccount.deposit(200);
        KennyAccount.deposit(500);
        Assertions.assertEquals(700,  KennyAccount.getBalance());

    }

    @Test
    public void withdraw_50_balance_0_AccountTest(){

        KennyAccount.deposit(50);
        KennyAccount.withdraw(50, "AbcDE12345");
        Assertions.assertEquals(0,  KennyAccount.getBalance());

    }

    @Test
    public void deposited_500_withdraw_3000_balance_2000_AccountTest(){

        KennyAccount.deposit(5000);
        KennyAccount.withdraw(3000, "AbcDE12345");
        Assertions.assertEquals(2000,  KennyAccount.getBalance());

    }


    @Test
    public void testThatAccountPasswordIsCorrect_Deposit800_Balance_800(){

        KennyAccount.deposit(800);
        KennyAccount.withdraw(0, "AbcDE12345");
        Assertions.assertEquals(800,  KennyAccount.getBalance());

    }


    @Test
    public void testThatAccountPasswordIsNotCorrect_Deposit800_Balance_800(){

        KennyAccount.deposit(800);
        KennyAccount.withdraw(0, "AbCDE12349");
        Assertions.assertEquals(800, KennyAccount.getBalance());
        Assertions.assertNotEquals("AbcDE12345", KennyAccount.getBalance());

    }


    @Test
    public void testThatIDepositedAndItReflectedInTheBank(){


    }

//    @Test
//    public void testThatIDeposited_500_Balance_500(){
//        KennyAccount.deposit(500);
//        assertEquals(500, KennyAccount.getBalance(),
//
//    }


}
