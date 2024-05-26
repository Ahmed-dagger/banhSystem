import org.example.Account;
import org.example.Database;
import org.example.Deposit;
import org.example.Login;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;


public class TestingExistence {

    @Mock
    private Database base;
    @Mock
    private Account acc;
    @Mock
    private ArrayList<Account> accounts;

    @BeforeEach
    void setUp()
    {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    void ExistenceTest()
    {
       acc = new Account("ahmed","dagger",1000,2500,123);
       accounts.add(acc);
       base.saveAccounts(accounts);

       Login log = new Login(accounts,base, acc.getAccid());

        boolean exist = log.Exist(acc.getAccid(), acc.getPasscode() , acc);
        MatcherAssert.assertThat(exist, Matchers.is(true));

    }

}
