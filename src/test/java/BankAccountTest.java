import com.tit.week04.day05.junit.advance_junit.testing_bank_transactions.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest{
    private BankAccount bankAccount;

    @BeforeEach
    void setUp(){
        bankAccount = new BankAccount();
    }
    //test for deposit
    @Test
    void testDeposit(){
        bankAccount.deposit(1500);
        assertEquals(1500, bankAccount.getBalance());
    }
    //test for withdraw
    @Test
    void testWithdraw(){
        bankAccount.deposit(20000);
        bankAccount.withdraw(5000);
        assertEquals(15000, bankAccount.getBalance());
    }
    //test for get balance
    @Test
    void TestGetBalance(){
        bankAccount.deposit(100000);
        assertEquals(100000,bankAccount.getBalance());
    }
}
