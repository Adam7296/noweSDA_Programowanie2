package pl.sda.academy.intermediate.basic.Basic8Files_Streams;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class BookStoreTest {
    private static final int NUMBER_OF_BOOKS_AFTER_INITIALIZATION = 36;

    private static BookStore bookStore;

    @BeforeClass
    public static void setUpClass() {
        bookStore = new BookStore();
    }

    @Test
    public void testBokstoreIntialized() {
        Assert.assertEquals(NUMBER_OF_BOOKS_AFTER_INITIALIZATION, bookStore.getBooks().size());
    }

    @Test
    public void findBooksByTitle() {
//        Long Lost|Harlan Coben|2009|195|44.99|CRIME_STORY
        //given
        Book LongLostBook = Book.builder()
                .title("Long Lost")
                .author("Harlan Coben")
                .yearPublished(2009)
                .numberOfPages(195)
                .price(44.99)
                .genre(Genre.CRIME_STORY)
                .build();
        //when
        List<Book> booksByTitle = bookStore.findBookInTitle("Long Lost");
        //then
        Assert.assertEquals(1, booksByTitle.size());
        Assert.assertEquals(LongLostBook, booksByTitle.get(0));

    }


}