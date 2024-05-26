import org.example.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingLastName {



    @Test
    public void  testingLastname()
    {
        Account acc = new Account();
        String ahm = "Emam";
        acc.setLastName("Emam");

        assertEquals(ahm ,acc.getLastName());

    }



}
