class InvalidBookNameException extends Exception {
    public InvalidBookNameException(String msg) {
        super(msg);
    }
}
class InvalidBookIdException extends Exception {
    public InvalidBookIdException(String msg) {
        super(msg);
    }
}
class InvalidAuthorNameException extends Exception {
    public InvalidAuthorNameException(String msg) {
        super(msg);
    }
}
class InvalidYOPException extends Exception {
    public InvalidYOPException(String msg) {
        super(msg);
    }
}
class LibraryBook {
    private String BName;
    private String BId;
    private String BAuthor;
    private int YOP;
    public void setBName(String BName) throws InvalidBookNameException {
        if (!BName.matches("[A-Za-z0-9\\- ]+"))
            throw new InvalidBookNameException("Book Name can have only alphabets, digits and '-'");
        this.BName = BName;
    }
    public void setBId(String BId) throws InvalidBookIdException {
        if (!BId.matches("[A-Za-z0-9]+"))
            throw new InvalidBookIdException("Book ID must not contain whitespaces or special symbols");
        this.BId = BId;
    }
    public void setBAuthor(String BAuthor) throws InvalidAuthorNameException {
        if (!BAuthor.matches("[A-Za-z ]+"))
            throw new InvalidAuthorNameException("Author Name must contain only alphabets");
        this.BAuthor = BAuthor;
    }
    public void setYOP(int YOP) throws InvalidYOPException {
        if (!(String.valueOf(YOP).matches("\\d{4}")))
            throw new InvalidYOPException("Year of Publication must be a 4-digit number");
        this.YOP = YOP;
    }
    public String getBName() { return BName; }
    public String getBId() { return BId; }
    public String getBAuthor() { return BAuthor; }
    public int getYOP() { return YOP; }
    public String toString() {
        return "Book Details:\n" +
                "Name: " + BName + "\n" +
                "ID: " + BId + "\n" +
                "Author: " + BAuthor + "\n" +
                "Year of Publication: " + YOP + "\n";
    }
}
public class LibraryMain {
    public static void main(String[] args) {
        try {
            LibraryBook b1 = new LibraryBook();
            b1.setBName("Data Structures and Algorithms");
            b1.setBId("DSA101");
            b1.setBAuthor("Michael T Goodrich");
            b1.setYOP(2013);
            LibraryBook b2 = new LibraryBook();
            b2.setBName("Database Management Systems");
            b2.setBId("DBMS101");
            b2.setBAuthor("Ramakrishnan");
            b2.setYOP(2003);
            System.out.println(b1);
            System.out.println(b2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
