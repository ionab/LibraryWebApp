import models.Library;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library testLibrary;

    @Before
    public void before(){
        testLibrary = new Library("The John Muir library");
    }

    @Test
    public void canGetName(){
        assertEquals("The John Muir library", testLibrary.getName());
    }

}
