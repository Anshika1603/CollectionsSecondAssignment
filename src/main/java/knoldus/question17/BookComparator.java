package knoldus.question17;

import java.util.Comparator;

// Implementing Comparator to Compare the Books using the compare method
public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int result = book1.getAuthor().compareTo(book2.getAuthor());
        if (result == 0) {
            result = Double.compare(book2.getPrice(), book1.getPrice());
        }
        return result;
    }
}
