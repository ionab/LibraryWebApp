import db.DBHelper;
import models.Book;
import models.Borrower;
import models.Library;

public class Runner {

    public static void main(String[] args) {

        Library library = new Library("The Glasgow Library");
        DBHelper.save(library);

        Borrower borrower = new Borrower("Paul");
        DBHelper.save(borrower);

        Book book1 = new Book("A fantasy book", library, "The Lord Of The Rings", "J.R.R Tolkien", "Ladybug");
        Book book2 = new Book("A scifi book", library, "Back to the Future", "Kelsie Jnr", "80's productions");
        Book book3 = new Book("A biography", library, "Marty McFly", "My road to the future", "Flux inc");

        DBHelper.save(book1);
        DBHelper.save(book2);
        DBHelper.save(book3);

    }
}
