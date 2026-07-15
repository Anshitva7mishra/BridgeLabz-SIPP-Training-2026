class Book {
    public String isbn;
    protected String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    private double fileSizeMB;

    public EBook(String isbn, String title, String author, double fileSizeMB) {
        super(isbn, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

public class bookLibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 2.5);
        ebook.displayEBookInfo();

        ebook.setAuthor("Joshua Bloch (Revised)");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
