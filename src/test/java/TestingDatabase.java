import org.example.Account;
import org.junit.jupiter.api.Test;
import org.example.Database;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingDatabase {

    @Test
    public void testDatabase() {
    Database base = new Database();
    ArrayList<Account> arr = new ArrayList<>();


       base.saveAccounts(new ArrayList<Account>());

    assertEquals(arr,base.getAccounts());
    }

}
