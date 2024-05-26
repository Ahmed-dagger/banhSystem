import org.example.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testingbalance {

    @Test
    public void  testingBalnce()
    {
        Account acc = new Account();
        double bal = 100.0;
        acc.setBalance(100.0);

        assertEquals(bal ,acc.getBalance());

    }




}
