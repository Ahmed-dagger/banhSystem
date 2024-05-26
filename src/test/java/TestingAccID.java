import org.example.Account;
import org.example.Withdraw;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingAccID {



    @Test
    public void  testAccid()
    {
        Account acc = new Account();
        int id = 1000;
        acc.setAccid(1000);

        assertEquals(id ,acc.getAccid());

    }



}
