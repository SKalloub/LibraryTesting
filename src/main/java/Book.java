public class Book {
    private String title;
    private int ID;
    private boolean reserved;
    private Customer reservedBy;

    public Book(){

    }

    public Book(String title, int ID){

    }

    @Override
    public boolean equals(Object o){
        Book b = (Book) o;
        if (b.getID()==this.getID())
            return true;
            return false;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Customer getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(Customer reservedBy) {
        this.reservedBy = reservedBy;
    }
}
