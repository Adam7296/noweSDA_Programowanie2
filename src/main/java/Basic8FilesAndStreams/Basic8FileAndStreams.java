package Basic8FilesAndStreams;

import pl.sda.academy.intermediate.basic.Basic8Files_Streams.Book;
import pl.sda.academy.intermediate.basic.Basic8Files_Streams.BookStore;

import java.util.List;
import java.util.stream.Collectors;

class Basic8FilesAndStreams {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        List<String> AllAuthors = (List<String>) bookStore.getBooks()
                .stream()
                .map(Book::getAuthor)
//                .distinct()
                .collect(Collectors.toList());

        System.out.println(AllAuthors);


    }

}
