class SimpleBook {
    private String title;
    private String author;
    private double price;

    public SimpleBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public SimpleBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class bookDetails {
    public static void main(String[] args) {
        SimpleBook defaultBook = new SimpleBook();
        SimpleBook paramBook = new SimpleBook("Effective Java", "Joshua Bloch", 45.0);

        defaultBook.display();
        paramBook.display();
    }
}
