class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + isAvailable);
    }
}

public class libraryBookSystem {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("1984", "George Orwell", 15.99);
        book.display();
        book.borrowBook();
        book.display();
        book.borrowBook();
    }
}
