import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int ID;
    private String name;
    private List<Book> reservedBooks;
    private static final int LIMIT = 3;
    public Customer(){
        reservedBooks = new ArrayList<>();

    }
    public Customer(int ID, String name) {
        reservedBooks = new ArrayList<>();
        this.ID = ID;
        this.name = name;
    }
    public boolean AddBook(Book b) {
        if (b==null || b.isReserved())
            return false;
        if (reservedBooks==null)
            reservedBooks = new ArrayList<>();

        if (reservedBooks.size()<LIMIT) {
            reservedBooks.add(b);
            b.setReservedBy(this);
            return true;
        }
        else
            return false;
    }

    public boolean removeBook(Book b) {
        return reservedBooks.remove(b);
    }
}
