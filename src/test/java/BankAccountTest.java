import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

public class BankAccountTest {
    private BankAccount account;

    @Before
    public void setup() {
        account = new BankAccount("Rohaib", "Ahmed", LocalDate.of(2000, 3, 19), "10010110");
    }

    @Test
    public void testCheck() {
        Assert.assertEquals("Rohaib", account.getFirstName());
        Assert.assertEquals("Ahmed", account.getLastName());
        Assert.assertEquals(LocalDate.of(2000, 3, 19), account.getDateOfBirth());
        Assert.assertEquals("10010110", account.getAccountNumber());
        Assert.assertEquals(0.0, account.getBalance(), 0.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(200.00);
        Assert.assertEquals(200.00, account.getBalance(), 0);

    }

    @Test
    public void testWithdrawal() {
        account.deposit(200.0);
        account.withdrawal(150.0);
        Assert.assertEquals(50.0, account.getBalance(), 0.0);
    }

    @Test
    public void testPayInterest() {
        account.deposit(1000.0);
        account.payInterest(5.0);
        Assert.assertEquals(1050.0, account.getBalance(), 0.0);
    }

}

