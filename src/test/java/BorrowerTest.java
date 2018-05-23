import models.Borrower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower testBorrower;

    @Before
    public void before(){
        testBorrower = new Borrower("Andrew");
    }

    @Test
    public void canGetName(){
        assertEquals("Andrew", testBorrower.getName());
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, testBorrower.numberOfBooks());
    }

}
