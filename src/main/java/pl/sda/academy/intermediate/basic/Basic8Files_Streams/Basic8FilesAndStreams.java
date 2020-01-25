package pl.sda.academy.intermediate.basic.Basic8Files_Streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Basic8FilesAndStreams {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        List<String> allAuthors = (List<String>) bookStore.getBooks()
                .stream()
                .map(Book::getAuthor)
                .collect(Collectors.toList());

        int numberBooksOfAuthor = bookStore.FindBookInAuthor("Arthur Conan Doyle").size();

        double totalCostForBooksFantasy = bookStore.FindBooksOfGenre(Genre.FANTASY)
                .stream()
                .filter(book -> book.getYearPublished() >= 1900 && book.getYearPublished() <= 1999)
                .filter(book -> BigDecimal.valueOf(book.getPrice()).compareTo(BigDecimal.valueOf(40.0)) > 0)
                .mapToDouble(Book::getPrice)
                .sum();


        System.out.println("=============================================================================================================================================================================================");
        System.out.println("Wszyscy autorzy to " + allAuthors);
        System.out.println("==========================================================================");
        System.out.println("Autor Arthur Conan Doyle ma książek: " + numberBooksOfAuthor);
        System.out.println("==========================================================================");
        System.out.println(totalCostForBooksFantasy);
        System.out.println("==========================================================================");


    }
}
