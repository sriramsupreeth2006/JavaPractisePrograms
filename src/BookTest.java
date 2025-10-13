class Book {
    private String Bname, B_ID, BAuthor, Year;
    public Book(String Bname, String B_ID, String BAuthor, String Year) {
        setBName(Bname);
        setB_ID(B_ID);
        setBAuthor(BAuthor);
        setYearPublish(Year);
    }
    public void setBName(String BName) {
        if (!BName.matches("[A-Za-z0-9\\- ]+"))
            throw new IllegalArgumentException("Book name is invalid.");
        this.Bname = BName;
    }
    public void setB_ID(String B_ID) {
        if (!B_ID.matches("[A-Za-z0-9]+"))
            throw new IllegalArgumentException("Book ID is invalid.");
        this.B_ID = B_ID;
    }
    public void setBAuthor(String BAuthor) {
        if (!BAuthor.matches("[A-Za-z ]+"))
            throw new IllegalArgumentException("Book Author is invalid.");
        this.BAuthor = BAuthor;
    }
    public void setYearPublish(String Year) {
        if (!Year.matches("\\d{4}"))
            throw new IllegalArgumentException("Book publication year is invalid.");
        this.Year = Year;
    }
    @Override
    public String toString() {
        return "Book[ID=" + B_ID + ", Name=" + Bname +
                ", Author=" + BAuthor + ", Year=" + Year + "]";
    }
}
public class BookTest {
    public static void main(String[] args) {
        try {
            Book b1 = new Book("Data Structures And Algorithms", "101", "Michael Goodrich", "2021");
            Book b2 = new Book("Fundamentals Of Data Structures", "102", "Ellis Horowitz", "1982");
            System.out.println(b1);
            System.out.println(b2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
