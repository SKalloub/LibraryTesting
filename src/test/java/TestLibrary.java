import org.junit.*;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
public class TestLibrary {
    Library library;
    Customer c1,c2,c3;
    Book b1,b2,b3,b4,b5;
    @Before
    public void initialize(){
        library = new Library();
        c1 = new Customer(1,"Saeed");
        c2 = new Customer(2,"Saad");
        c3 = new Customer(3,"Samer");
        b1 = new Book("a",1);
        b2 = new Book("b",2);
        b3 = new Book("c",3);
        b4 = new Book("d",4);
        b5 = new Book("e",5);
        library.AddBook(b1);
        library.AddBook(b2);
        library.AddBook(b3);
        library.AddBook(b4);
        library.AddBook(b5);

        library.AddCustomer(c1);
        library.AddCustomer(c2);
    }

    @Test
    public void ReserveBook(){
        assertTrue(library.reserveBook(c1,b1));
    }

    @Test
    public void returnBook(){
        library.reserveBook(c1,b1);
        assertTrue(library.returnBook(c1,b1));
    }
    @Test
    public void returnNBook(){
        assertFalse(library.returnBook(c2,b4));
    }
    @Test
    public void reserveNotRegisteredCustomer(){
        assertFalse(library.reserveBook(c3,b2));
    }
    @Test public void reserveAlreadyReserved(){
        library.reserveBook(c2,b3);
        assertFalse(library.reserveBook(c1,b3));
    }
    @Test public void AddAlreadyAddedCustomer(){
        library.AddCustomer(c2);
        assertFalse(library.AddCustomer(c2));
    }
}
