
Wed 11:38 PM
Ric Ratzinger
Adto mo ugma mga perd PATHFit day?
Ric Ratzinger
12:30
Thu 2:12 AM
Reys replied to Ric Ratzinger
na dli ko ka attend kay mo adtu ko butuan
Reys
ayaw na ug tunga uy
Ric Ratzinger replied to Reys
Aww ikaw
Thu 2:38 AM
Ric Ratzinger
Richkid man gihapon ka no worries
Thu 8:36 PM
Ric Ratzinger
Book.java
Ric Ratzinger
public class Book {
    public String bookId;
    public String title;
    public String author;
    public boolean available;

    // Constructor
    public Book(String bookId, String title, String author, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // ✅ Add these getter methods:
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Optional: Display method
    public void displayBookDetails() {
        System.out.println(bookId + " - " + title + " by " + author + " [" + (available ? "Available" : "Not Available") + "]");
    }
}