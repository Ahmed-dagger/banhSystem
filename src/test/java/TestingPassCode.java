import org.example.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingPassCode {


    @Test
    public void  testingPasscode()
    {
        Account acc = new Account();
        int pass = 100;
        acc.setPasscode(100);

        assertEquals(pass ,acc.getPasscode());

    }



}
