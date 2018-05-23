import models.Book;
import models.Library;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1;

    @Before
    public void before(){
    Library library = new Library("The John Muir library");

    book1 = new Book("A fantasy book", library, "The Lord Of The Rings", "J.R.R Tolkien", "Ladybug");
    @Test
    public void canGetDescription(){
        assertEquals("A fantasy book", book1.getDescription());
    }
    @Test
    public void canGetAuthor(){
        assertEquals("The Lord Of The Rings", book1.getAuthor());
    }
    @Test
    public void canGetTitle(){
        assertEquals("J.R.R Tolkien", book1.getTitle());
    }
    @Test
    public void canGetPublisher(){
        assertEquals("Ladybug", book1.getPublisher());
    }

}
