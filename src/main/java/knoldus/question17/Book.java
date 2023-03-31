package knoldus.question17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        /* Initializing the ArrayList to add the records of Books */
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 100.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 870.99));
        books.add(new Book("1984", "George Orwell", 120.99));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 999.99));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 750.99));

        /* Using Comparator to sort the books */
        Comparator<Book> comparator = new BookComparator();
        Collections.sort(books, comparator);

        /* Printing the records of books */
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

