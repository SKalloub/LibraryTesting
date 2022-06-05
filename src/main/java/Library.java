import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    public Library(){

    }
    public boolean AddCustomer(Customer c){
        if (customers.contains(c))
            return false;
        else return customers.add(c);
    }
    public boolean AddBook(Book b){
        if (bookList.contains(b))
            return false;
        else return bookList.add(b);
    }
    public boolean reserveBook(Customer c, Book b) {
        if (!customers.contains(c) || !bookList.contains(b))
            return false;
        if (b==null || c==null)
            return false;
        if (b.isReserved())
            return false;
        // Check if the reservation already exist
        for (Reservation r: reservations) {
            if (r.getBook()==b && r.getCustomer()==c)
                return false;
        }
        if (c.AddBook(b)) {
            b.setReserved(true);
           return reservations.add(new Reservation(b,c));
        }
        else
            return false;
    }

    public boolean returnBook(Customer c, Book b) {
        if (!customers.contains(c) || !bookList.contains(b))
            return false;
        Reservation found = null;
        for (Reservation r : reservations) {
            if (r.getBook() == b && r.getCustomer() == c) {
                found = r;
            }
        }
        if (found == null)
            return false;
        else {
            reservations.remove(found);
            c.removeBook(b);
            b.setReserved(false);
            b.setReservedBy(null);
            return true;
        }
    }
}
