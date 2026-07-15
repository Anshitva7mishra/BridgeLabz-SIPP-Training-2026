abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId + " | Title: " + title + " | Author: " + author + " | Loan Duration: " + getLoanDuration() + " days");
    }
}

class LibraryBookItem extends LibraryItem {
    public LibraryBookItem(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class LibraryMagazineItem extends LibraryItem {
    public LibraryMagazineItem(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class LibraryDVDItem extends LibraryItem {
    public LibraryDVDItem(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class libraryManagementSystem {
    public static void main(String[] args) {
        LibraryBookItem book = new LibraryBookItem("B01", "Effective Java", "Joshua Bloch");
        LibraryMagazineItem magazine = new LibraryMagazineItem("M01", "Time Magazine", "Various");
        LibraryDVDItem dvd = new LibraryDVDItem("D01", "Inception", "Christopher Nolan");

        book.displayItemDetails();
        magazine.displayItemDetails();
        dvd.displayItemDetails();
    }
}
