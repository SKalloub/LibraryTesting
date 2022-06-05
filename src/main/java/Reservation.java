import java.util.ArrayList;
import java.util.List;

public class Reservation {
private Book book;
private Customer customer;
private int daysLeft;

public Reservation(){
}
public Reservation(Book b, Customer c){
    book =b;
    customer =c;
    daysLeft = 5;
}

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
        daysLeft = 5;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }
}
