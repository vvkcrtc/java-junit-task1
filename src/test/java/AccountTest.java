import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
    Account savAccTest;
    Account creditAccTest;
    Account checkAccTest;

    @BeforeEach
    public void init() {
        System.out.println("Init test");
        savAccTest = new SavingsAccount(101, 1500);
        creditAccTest = new CreditAccount(102, 1000);
        checkAccTest = new CheckingAccount(103, 2000);
    }

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @Test
    public void testTransfer() {
        int balance = 0;
        int expected = -800;
        checkAccTest.transfer(creditAccTest, 200);
        balance = creditAccTest.getBalance();
        assertEquals(expected, balance);
    }

    @Test
    public void addMoneyTest() {
        int balance = 0;
        int expected = 3100;
        savAccTest.addMoney(1500);
        balance = savAccTest.getBalance();
        assertEquals(expected, balance);
    }

    @Test
    public void payTest() {
        int balance = 0;
        int expected = 1900;
        checkAccTest.pay(100);
        balance = checkAccTest.getBalance();
        assertEquals(expected, balance);
    }


}
