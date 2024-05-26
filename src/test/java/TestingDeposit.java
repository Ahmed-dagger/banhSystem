import org.example.*;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito.*;

import java.util.ArrayList;
import org.hamcrest.MatcherAssert.*;
import org.hamcrest.Matchers;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;


public class TestingDeposit {

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
        double dep = 0.0;
        Deposit depo = new Deposit(acc,base,accounts);
        boolean NotNUll = depo.depositeNotNull(dep);

        MatcherAssert.assertThat(NotNUll, Matchers.is(true));
    }

}
