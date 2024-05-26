import org.example.Account;
import org.example.Database;
import org.example.Deposit;
import org.example.Withdraw;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;


public class TestingWithdraw {

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
    void DepositTest()
    {
        double with = 0.0;
        Withdraw withdraw = new Withdraw(acc,base,accounts);
        boolean NotNUll = withdraw.withdrawNotNull(with);

        MatcherAssert.assertThat(NotNUll, Matchers.is(true));


    }

}
