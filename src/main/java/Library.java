import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library() {
        this.books = new ArrayList<>();
        this.capacity = 5;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public void removeBook() {
        if (this.bookCount() > 0) {
            this.books.remove(0);}
        }
    }
