import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowedTest {
    private Borrowed borrowed1;
    private Book book1;
    private Library library;

    @Before
    public void before() {
        this.borrowed1 = new Borrowed();
        this.book1 = new Book();
        this.library = new Library();
    }

//    @Test
//    public void canBorrowBook() {
//        this.library.addBook(book1);
//        borrowed1.canBorrowBook(library);
//        assertEquals(1, borrowed1.borrowedCount());
//    }


        }


