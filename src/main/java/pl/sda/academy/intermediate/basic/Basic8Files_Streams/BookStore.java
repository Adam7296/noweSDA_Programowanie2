package pl.sda.academy.intermediate.basic.Basic8Files_Streams;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BookStore {

    private List<Book> books;

    public BookStore() {
        this.books = new BookStoreInitializer().initBookStore();
    }

    List<Book> findBookInTitle(String title) {
        return this.books
                .stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());

    }

    List<Book> FindBookInAuthor(String author) {
        return this.books
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    List<Book> FindYearPublished(int year) {
        return this.books
                .stream()
                .filter(book -> book.getYearPublished() == (year))
                .collect(Collectors.toList());
    }

    List<Book> FindNumberOfPages(int pages) {
        return this.books
                .stream()
                .filter(book -> book.getNumberOfPages() == pages)
                .collect(Collectors.toList());
    }

    List<Book> FindBookOfPrice(double price) {
        return this.books
                .stream()
                .filter(book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(price)))
                .collect(Collectors.toList());
    }

    List<Book> FindBooksOfGenre(Genre genre) {
        return this.books
                .stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
    }


}