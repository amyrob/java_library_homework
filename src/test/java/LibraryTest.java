import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Borrowed borrowed1;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book();
        borrowed1 = new Borrowed();
    }

    @Test
    public void numberOfBooks() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBook() {
        this.library.addBook(book1);
        this.library.removeBook();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canBorrowBook() {
        this.library.addBook(book1);
        borrowed1.canBorrowBook(library);
        assertEquals(1, borrowed1.borrowedCount());


    }
}