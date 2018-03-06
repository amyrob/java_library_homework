import java.util.ArrayList;

public class Borrowed {
    private ArrayList<Borrowed> books;


    public Borrowed() {
        this.books = new ArrayList<>();
    }

    public void addBook(Borrowed books) {
        this.books.add(books);
    }

    public int borrowedCount() {
        return this.books.size();
    }

//    public void canBorrowBook(Library library) {
//        library.removeBook(;
//    }
}
