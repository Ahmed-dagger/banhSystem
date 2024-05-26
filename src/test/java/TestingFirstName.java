import org.example.Account;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingFirstName {

   @Test
    public void  testingFirstname()
    {
        Account acc = new Account();
        String ahm = "Ahmed1";
        acc.setFirstName("Ahmed");

        assertEquals(ahm ,acc.getFirstName());

    }


}
